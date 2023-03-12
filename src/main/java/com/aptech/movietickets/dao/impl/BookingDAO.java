package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.mapper.BookingMapper;
import com.aptech.movietickets.model.BookingModel;
import java.util.List;

public class BookingDAO extends BaseDAO<BookingModel> implements IBookingDAO {
    
    @Override
    public int save(BookingModel bookingModel) {
        String sql = "INSERT INTO booking (customer_id,schedule_id,seat_id) VALUES (?,?,?)";
        return insert(sql,
                bookingModel.getCustomer_id(),
                bookingModel.getSchedule_id(),
                bookingModel.getSeat_id());
    }
    
    @Override
    public List<BookingModel> findAll() {
        String sql = "SELECT * FROM booking";
        return query(sql, new BookingMapper());
    }
    
    @Override
    public void update(BookingModel updateBooking) {
        String sql = "UPDATE `booking` SET `customer_id`=?,`schedule_id`=?,`seat_id`=? WHERE id = ?";
        update(sql,
                updateBooking.getCustomer_id(),
                updateBooking.getSchedule_id(),
                updateBooking.getSeat_id(),
                updateBooking.getId());
    }
    
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM `booking` WHERE id = ?";
        update(sql, id);
    }
    
    @Override
    public BookingModel findOne(int id) {
        String sql = "SELECT * FROM booking WHERE id = ?";
        List<BookingModel> bookings = query(sql, new BookingMapper(), id);
        return bookings.isEmpty() ? null : bookings.get(0);
    }
    
    @Override
    public BookingModel findByCutomerId(int customer_id) {
        String sql = "SELECT * FROM booking WHERE customer_id = ?";
        List<BookingModel> bookings = query(sql, new BookingMapper(), customer_id);
        return bookings.isEmpty() ? null : bookings.get(0);
    }
    
    @Override
    public BookingModel findByScheduleId(int schedule_id) {
        String sql = "SELECT * FROM booking WHERE schedule_id = ?";
        List<BookingModel> bookings = query(sql, new BookingMapper(), schedule_id);
        return bookings.isEmpty() ? null : bookings.get(0);
    }
    
    @Override
    public BookingModel findBySeatId(int seat_id) {
        String sql = "SELECT * FROM booking WHERE seat_id = ?";
        List<BookingModel> bookings = query(sql, new BookingMapper(), seat_id);
        return bookings.isEmpty() ? null : bookings.get(0);
    }
    
    @Override
    public BookingModel findByScheduleIdAndSeatId(int schedule_id, int seat_id) {
        String sql = "SELECT * FROM booking WHERE schedule_id = ? AND  seat_id = ?";
        List<BookingModel> bookings = query(sql, new BookingMapper(), schedule_id, seat_id);
        return bookings.isEmpty() ? null : bookings.get(0);
    }
    
    @Override
    public void deleteAll() {
        String sql = "DELETE FROM booking";
        update(sql);
    }
    
}
