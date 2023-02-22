package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.BookingModel;
import java.util.List;

public interface IBookingDAO {

    List<BookingModel> findAll();
    
    int save(BookingModel bookingModel);
    
    void update(BookingModel updateBooking);
    
    void delete(int id);
    
    BookingModel findOne(int id);

}
