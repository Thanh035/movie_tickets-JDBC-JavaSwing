package com.aptech.movietickets.service.impl;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.ISeatDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.SeatDAO;
import com.aptech.movietickets.model.BookingModel;
import com.aptech.movietickets.model.SeatModel;
import java.util.List;
import com.aptech.movietickets.service.ISeatService;

public class SeatService implements ISeatService {

    private ISeatDAO seatDAO = new SeatDAO();
    private IBookingDAO bookingDAO = new BookingDAO();

    @Override
    public SeatModel save(SeatModel seatModel) {
        int seat_id = seatDAO.save(seatModel);
        return seatDAO.findOne(seat_id);
    }

    @Override
    public SeatModel update(SeatModel updateSeat) {
        seatDAO.update(updateSeat);
        return seatDAO.findOne(updateSeat.getId());
    }

    @Override
    public List<SeatModel> findAll() {
        return seatDAO.findAll();
    }

    @Override
    public boolean delete(int id) {
        BookingModel bookingModel = bookingDAO.findBySeatId(id);
        if (bookingModel == null) {
            seatDAO.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public int getTotalItem() {
        return seatDAO.getTotalItem();
    }

    @Override
    public boolean removeAll() {
        List<BookingModel> bookings = bookingDAO.findAll();
        if (bookings.isEmpty()) {
            seatDAO.deleteAll();
            return true;
        }
        return false;
    }

}
