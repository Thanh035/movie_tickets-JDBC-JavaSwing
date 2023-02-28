package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.ScheduleModel;
import java.sql.Date;
import java.util.List;

public interface IScheduleDAO {

    List<ScheduleModel> findAll();

    int save(ScheduleModel scheduleModel);

    void update(ScheduleModel updateSchedule);

    void delete(int id);

    ScheduleModel findOne(int id);

    ScheduleModel findByMovie_id(int movie_id);

    List<ScheduleModel> findByScheduleDate(Date scheduleDate);

    List<ScheduleModel> findDistinctScheduleDate();

    ScheduleModel findByScheduleName(String schedule_name);

}
