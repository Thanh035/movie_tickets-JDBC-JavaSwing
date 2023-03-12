package com.aptech.movietickets.service;

import com.aptech.movietickets.model.ScheduleModel;
import java.sql.Date;
import java.util.List;

public interface IScheduleService {

    ScheduleModel save(ScheduleModel scheduleModel);

    ScheduleModel update(ScheduleModel updateSchedule);

    boolean delete(int id);

    List<ScheduleModel> findAll();

    List<ScheduleModel> findByScheduleDate(Date scheduleDate);

    List<ScheduleModel> findDistinctScheduleDate();

    ScheduleModel findOne(int id);

}
