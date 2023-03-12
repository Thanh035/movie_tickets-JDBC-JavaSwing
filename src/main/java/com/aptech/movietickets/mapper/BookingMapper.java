package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.BookingModel;
import java.sql.ResultSet;

public class BookingMapper implements Rowmapper<BookingModel>{

    @Override
    public BookingModel mapRow(ResultSet rs) {
        try {
            BookingModel booking = new BookingModel();
            booking.setId(rs.getInt("id"));
            booking.setCustomer_id(rs.getInt("customer_id"));
            booking.setSchedule_id(rs.getInt("schedule_id"));
            booking.setSeat_id(rs.getInt("seat_id"));
            return booking;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

}
