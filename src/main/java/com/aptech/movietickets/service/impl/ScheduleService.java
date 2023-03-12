package com.aptech.movietickets.service.impl;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IRoomDAO;
import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.RoomDAO;
import com.aptech.movietickets.dao.impl.ScheduleDAO;
import com.aptech.movietickets.model.ScheduleModel;
import com.aptech.movietickets.service.IScheduleService;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class ScheduleService implements IScheduleService {

    private IMovieDAO movieDAO = new MovieDAO();
    private IRoomDAO roomDAO = new RoomDAO();
    private IBookingDAO bookingDAO = new BookingDAO();
    private IScheduleDAO scheduleDAO = new ScheduleDAO();

    @Override
    public ScheduleModel save(ScheduleModel scheduleModel) {
        String movie_name = scheduleModel.getMovie_name();
        String room_name = scheduleModel.getRoom_name();
        Double vip_ticket = scheduleModel.getVip_ticket();
        Double normal_ticket = scheduleModel.getNormal_ticket();
        Date scheduleDate = scheduleModel.getSchedule_date();
        Time schedule_start = scheduleModel.getSchedule_start();

        int movie_id = movieDAO.findByTitle(movie_name).getId();
        int room_id = roomDAO.findByName(room_name).getId();
        scheduleModel.setMovie_id(movie_id);
        scheduleModel.setRoom_id(room_id);
        String schedule_name = movie_name + " | " + scheduleDate + " | " + schedule_start;

        scheduleModel.setName(schedule_name);
        int schedule_id = scheduleDAO.save(scheduleModel);
        return scheduleDAO.findOne(schedule_id);
    }

    @Override
    public ScheduleModel update(ScheduleModel updateSchedule) {
        String movie_name = updateSchedule.getMovie_name();
        String room_name = updateSchedule.getRoom_name();
        Double vip_ticket = updateSchedule.getVip_ticket();
        Double normal_ticket = updateSchedule.getNormal_ticket();
        Date scheduleDate = updateSchedule.getSchedule_date();
        Time schedule_start = updateSchedule.getSchedule_start();

        int movie_id = movieDAO.findByTitle(movie_name).getId();
        int room_id = roomDAO.findByName(room_name).getId();

        updateSchedule.setMovie_id(movie_id);
        updateSchedule.setRoom_id(room_id);
        String schedule_name = movie_name + " | " + scheduleDate + " | " + schedule_start;

        updateSchedule.setName(schedule_name);
        scheduleDAO.update(updateSchedule);
        return scheduleDAO.findOne(updateSchedule.getId());
    }

    @Override
    public boolean delete(int id) {
        if (bookingDAO.findByScheduleId(id) == null) {
            scheduleDAO.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public List<ScheduleModel> findAll() {
        return scheduleDAO.findAll();
    }

    @Override
    public List<ScheduleModel> findByScheduleDate(Date scheduleDate) {
        return scheduleDAO.findByScheduleDate(scheduleDate);
    }

    @Override
    public List<ScheduleModel> findDistinctScheduleDate() {
        return scheduleDAO.findDistinctScheduleDate();
    }

    @Override
    public ScheduleModel findOne(int id) {
        return scheduleDAO.findOne(id);
    }
}
