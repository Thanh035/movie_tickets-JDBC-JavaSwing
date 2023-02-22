package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.mapper.ScheduleMapper;
import com.aptech.movietickets.model.ScheduleModel;
import java.util.List;

public class ScheduleDAO extends BaseDAO<ScheduleModel> implements IScheduleDAO {

    @Override
    public List<ScheduleModel> findAll() {
        String sql = "SELECT * FROM schedule";
        return query(sql, new ScheduleMapper());
    }

    @Override
    public int save(ScheduleModel scheduleModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO `schedule`(`movie_id`, `vip_ticket`, `normal_ticket`, `schedule_date`, `schedule_start`, `schedule_end`, `room_id`) ");
        sql.append("VALUES (?,?,?,?,?,?,?')");
        return insert(sql.toString(),
                scheduleModel.getMovie_id(),
                scheduleModel.getVip_ticket(),
                scheduleModel.getNormal_ticket(),
                scheduleModel.getSchedule_date(),
                scheduleModel.getSchedule_start(),
                scheduleModel.getSchedule_end());
    }

    @Override
    public void update(ScheduleModel updateSchedule) {
        String sql = "UPDATE `schedule` SET `movie_id`=?,`vip_ticket`=?,`normal_ticket`=?,`schedule_date`=?,`schedule_start`=?,`schedule_end`=?,`room_id`=? WHERE id = ?";
        update(sql,
                updateSchedule.getMovie_id(),
                updateSchedule.getVip_ticket(),
                updateSchedule.getNormal_ticket(),
                updateSchedule.getSchedule_date(),
                updateSchedule.getSchedule_start(),
                updateSchedule.getSchedule_end(),
                updateSchedule.getRoom_id(),
                updateSchedule.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM schedule WHERE id = ?";
        update(sql, id);
    }

    @Override
    public ScheduleModel findByMovie_id(int movie_id) {
        String sql = "SELECT * FROM schedule WHERE movie_id = ?";
        List<ScheduleModel> schedules = query(sql, new ScheduleMapper(), movie_id);
        return schedules.isEmpty() ? null : schedules.get(0);
    }
}
