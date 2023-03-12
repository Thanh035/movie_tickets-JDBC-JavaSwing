/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.ScheduleModel;
import java.sql.ResultSet;

public class ScheduleDateMapper implements Rowmapper<ScheduleModel> {

    @Override
    public ScheduleModel mapRow(ResultSet rs) {
        try {
            ScheduleModel scheduleModel = new ScheduleModel();
            scheduleModel.setSchedule_date(rs.getDate("schedule_date"));
            return scheduleModel;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

}
