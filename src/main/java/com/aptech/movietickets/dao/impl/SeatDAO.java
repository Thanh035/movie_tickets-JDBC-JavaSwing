package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.ISeatDAO;
import com.aptech.movietickets.mapper.SeatMapper;
import com.aptech.movietickets.model.SeatModel;
import java.util.List;

public class SeatDAO extends BaseDAO<SeatModel> implements ISeatDAO {

    @Override
    public List<SeatModel> findAll() {
        String sql = "SELECT * FROM seat";
        return query(sql, new SeatMapper());
    }

    public int save(SeatModel seatModel) {
        String sql = "INSERT INTO seat (seat_row,seat_column,type,seat_code) VALUES (?, ?, ?, ?)";
        return insert(sql,
                seatModel.getRow(),
                seatModel.getColumn(),
                seatModel.getType(),
                seatModel.getCode());
    }

    public void update(SeatModel updateSeat) {
        String sql = "UPDATE seat SET row,column,type,code WHERE id = ?";
        update(sql,
                updateSeat.getRow(),
                updateSeat.getColumn(),
                updateSeat.getType(),
                updateSeat.getCode());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM seat WHERE id = ?";
        update(sql, id);
    }

    @Override
    public SeatModel findOne(int id) {
        String sql = "SELECT * FROM seat WHERE id = ?";
        List<SeatModel> seats = query(sql, new SeatMapper(), id);
        return seats.isEmpty() ? null : seats.get(0);
    }

}
