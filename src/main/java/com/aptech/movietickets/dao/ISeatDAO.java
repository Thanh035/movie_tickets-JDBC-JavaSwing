package com.aptech.movietickets.dao;

import java.util.List;

import com.aptech.movietickets.model.SeatModel;

public interface ISeatDAO {

    List<SeatModel> findAll();

    int save(SeatModel seaatModel);

    void update(SeatModel updateSeat);

    void delete(int id);

    SeatModel findOne(int id);
}
