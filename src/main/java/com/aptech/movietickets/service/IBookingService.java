package com.aptech.movietickets.service;

import com.aptech.movietickets.model.BookingModel;
import java.util.List;

public interface IBookingService {

    BookingModel save(BookingModel bookingModel);

    BookingModel update(BookingModel updateBooking);

    List<BookingModel> findAll();

    void delete(int id);

    boolean removeAll();

    BookingModel findByScheduleName(String schedule_name);
}
