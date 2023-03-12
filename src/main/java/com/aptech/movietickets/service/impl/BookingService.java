package com.aptech.movietickets.service.impl;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.dao.ISeatDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.RoomDAO;
import com.aptech.movietickets.dao.impl.ScheduleDAO;
import com.aptech.movietickets.dao.impl.SeatDAO;
import com.aptech.movietickets.model.BookingModel;
import com.aptech.movietickets.model.CustomerModel;
import com.aptech.movietickets.model.SeatModel;
import com.aptech.movietickets.service.IBookingService;
import com.aptech.movietickets.service.ICustomerService;
import java.util.List;

public class BookingService implements IBookingService {

    private IScheduleDAO scheduleDAO = new ScheduleDAO();
    private IMovieDAO movieDAO = new MovieDAO();
    private ICustomerService customerService = new CustomerService();
    private IBookingDAO bookingDAO = new BookingDAO();
    private ISeatDAO seatDAO = new SeatDAO();
    private IRoomDAO roomDAO = new RoomDAO();

    @Override
    public BookingModel save(BookingModel booking) {
        String fullname = booking.getFullname();
        String phone_number = booking.getPhone_number();
        String seat_code = booking.getSeat_code();
        String movie = booking.getMovie_schedule();

        SeatModel seat = seatDAO.findBySeatCode(seat_code);
        int seat_id = seat.getId();
        int schedule_id = scheduleDAO.findByScheduleName(booking.getMovie_schedule()).getId();

        if (bookingDAO.findByScheduleIdAndSeatId(schedule_id, seat_id) != null) {
            return null;
        }

        CustomerModel customer = customerService.findByPhoneNumber(phone_number);
        int customer_id = -1;
        int point = 100;
        if (seat.getType().equalsIgnoreCase("Vip")) {
            point = 150;
        }
        if (customer != null) {
            customer.setFullname(fullname);
            customer.setPoint(customer.getPoint() + point);
            customer_id = customer.getId();
            customerService.update(customer);
        } else {
            customer = new CustomerModel();
            customer.setFullname(fullname);
            customer.setPhone_number(phone_number);
            customer.setPoint(customer.getPoint() + point);
            customer_id = customerService.save(customer).getId();
        }

        BookingModel bookingModel = new BookingModel();
        bookingModel.setCustomer_id(customer_id);
        bookingModel.setSchedule_id(schedule_id);
        bookingModel.setSeat_id(seat_id);

        int booking_id = bookingDAO.save(bookingModel);
        return bookingDAO.findOne(booking_id);
    }

    @Override
    public BookingModel update(BookingModel updateBooking) {
        String fullname = updateBooking.getFullname();
        String phone_number = updateBooking.getPhone_number();
        String seat_code = updateBooking.getSeat_code();
        String movie = updateBooking.getMovie_schedule();
        int id = updateBooking.getId();

        SeatModel seat = seatDAO.findBySeatCode(seat_code);
        int seat_id = seat.getId();
        int schedule_id = scheduleDAO.findByScheduleName(updateBooking.getMovie_schedule()).getId();

        if (bookingDAO.findByScheduleIdAndSeatId(schedule_id, seat_id) != null) {
            return null;
        }

        CustomerModel customer = customerService.findByPhoneNumber(phone_number);

        int point = -50;
        String oldType = seatDAO.findOne(bookingDAO.findOne(id).getSeat_id()).getType();
        if (seat.getType().equalsIgnoreCase(oldType)) {
            point = 0;
        } else if (seat.getType().equalsIgnoreCase("Vip")) {
            point = 50;
        }

        customer.setFullname(fullname);
        customer.setPoint(customer.getPoint() + point);
        int customer_id = customer.getId();
        customerService.update(customer);

        updateBooking.setCustomer_id(customer_id);
        updateBooking.setSchedule_id(schedule_id);
        updateBooking.setSeat_id(seat_id);
        updateBooking.setId(id);

        bookingDAO.update(updateBooking);
        return bookingDAO.findOne(updateBooking.getId());
    }

    @Override
    public List<BookingModel> findAll() {
        return bookingDAO.findAll();
    }

    @Override
    public void delete(int id) {
        //Update data to Customer
        SeatModel seat = seatDAO.findOne(bookingDAO.findOne(id).getSeat_id());
        CustomerModel customer = customerService.findOne(bookingDAO.findOne(id).getCustomer_id());
        int point = 100;
        if (seat.getType().equalsIgnoreCase("Vip")) {
            point = 150;
        }
        customer.setPoint(customer.getPoint() - point);
        customerService.update(customer);

        //Delete booking
        bookingDAO.delete(id);
    }

    @Override
    public boolean removeAll() {
        bookingDAO.deleteAll();
        return true;
    }

    @Override
    public BookingModel findByScheduleName(String schedule_name) {
        int schedule_id = scheduleDAO.findByScheduleName(schedule_name).getId();
        return bookingDAO.findByScheduleId(schedule_id);
    }

}
