package com.aptech.movietickets.service;

import com.aptech.movietickets.model.SeatModel;
import java.util.List;

public interface ISeatService {

    SeatModel save(SeatModel seatModel);

    SeatModel update(SeatModel updateSeat);

    List<SeatModel> findAll();

    boolean delete(int id);

    int getTotalItem();

    boolean removeAll();

}
