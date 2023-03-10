package com.aptech.movietickets.dao;

import java.util.List;

import com.aptech.movietickets.model.SeatModel;

public interface ISeatDAO {

    List<SeatModel> findAll();

    int save(SeatModel seatModel);

    void update(SeatModel updateSeat);

    void delete(int id);

    SeatModel findOne(int id);
    
    SeatModel findBySeatCode(String seat_code);
    
    int getTotalItem();
    
    void deleteAll();
    
}
