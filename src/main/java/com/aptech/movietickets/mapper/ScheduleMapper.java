package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.ScheduleModel;
import java.sql.ResultSet;

public class ScheduleMapper implements Rowmapper<ScheduleModel> {
    
    @Override
    public ScheduleModel mapRow(ResultSet rs) {
        try {
            ScheduleModel schedule = new ScheduleModel();
            schedule.setId(rs.getInt("id"));
            schedule.setMovie_id(rs.getInt("movie_id"));
            schedule.setRoom_id(rs.getInt("room_id"));
            schedule.setNormal_ticket(rs.getDouble("normal_ticket"));
            schedule.setVip_ticket(rs.getDouble("vip_ticket"));
            schedule.setSchedule_date(rs.getDate("schedule_date"));
            schedule.setSchedule_start(rs.getTime("schedule_start"));
            schedule.setName(rs.getString("name"));
            return schedule;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
