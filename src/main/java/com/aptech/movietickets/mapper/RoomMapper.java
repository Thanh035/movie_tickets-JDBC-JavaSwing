package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.RoomModel;
import java.sql.ResultSet;

public class RoomMapper implements Rowmapper<RoomModel> {

    @Override
    public RoomModel mapRow(ResultSet rs) {
        try {
            RoomModel room = new RoomModel();
            room.setId(rs.getInt("id"));
            room.setRoom_name(rs.getString("name"));
            return room;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

}
