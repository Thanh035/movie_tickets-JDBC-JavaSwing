package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.SeatModel;
import java.sql.ResultSet;

public class SeatMapper implements Rowmapper<SeatModel> {

    @Override
    public SeatModel mapRow(ResultSet rs) {
        try {
            SeatModel seat = new SeatModel();
            seat.setRow(rs.getString("seat_row"));
            seat.setColumn(rs.getString("seat_column"));
            seat.setType(rs.getString("type"));
            seat.setCode(rs.getString("seat_code"));
            return seat;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

}
