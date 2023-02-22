package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.mapper.RoomMapper;
import com.aptech.movietickets.model.RoomModel;
import java.util.List;

public class RoomDAO extends BaseDAO<RoomModel> implements IRoomDAO {

    @Override
    public RoomModel findOne(int id) {
        String sql = "SELECT * FROM room WHERE id = ?";
        List<RoomModel> rooms = query(sql, new RoomMapper(), id);
        return rooms.isEmpty() ? null : rooms.get(0);
    }

    @Override
    public List<RoomModel> findAll() {
        String sql = "SELECT * FROM room";
        return query(sql, new RoomMapper());
    }

    @Override
    public RoomModel findByName(String room_name) {
        String sql = "SELECT * FROM room WHERE name = ?";
        List<RoomModel> rooms = query(sql, new RoomMapper(), room_name);
        return rooms.isEmpty() ? null : rooms.get(0);
    }

    @Override
    public int save(RoomModel roomModel) {
        String sql = "INSERT INTO `room`(`name`) VALUES (?)";
        return insert(sql, 
                roomModel.getRoom_name());
    }

    @Override
    public void update(RoomModel updateRoom) {
        String sql = "UPDATE `room` SET `name`=? WHERE id = ?";
        update(sql,
                updateRoom.getRoom_name(),
                updateRoom.getId());
    }

    @Override
    public void detele(int id) {
        String sql = "DELETE FROM `room` WHERE id = ?";
        update(sql,id);
    }

}
