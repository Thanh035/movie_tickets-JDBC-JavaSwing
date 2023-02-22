package com.aptech.movietickets.model;

import java.sql.Date;
import java.sql.Time;

public class ScheduleModel extends BaseModel<ScheduleModel> {

    private int movie_id;
    private int room_id;
    private Double vip_ticket;
    private Double normal_ticket;
    private Date schedule_date;
    private Time schedule_start;
    private Time schedule_end;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public Date getSchedule_date() {
        return schedule_date;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public Double getVip_ticket() {
        return vip_ticket;
    }

    public void setVip_ticket(Double vip_ticket) {
        this.vip_ticket = vip_ticket;
    }

    public Double getNormal_ticket() {
        return normal_ticket;
    }

    public void setNormal_ticket(Double normal_ticket) {
        this.normal_ticket = normal_ticket;
    }

    public void setSchedule_date(Date schedule_date) {
        this.schedule_date = schedule_date;
    }

    public Time getSchedule_start() {
        return schedule_start;
    }

    public void setSchedule_start(Time schedule_start) {
        this.schedule_start = schedule_start;
    }

    public Time getSchedule_end() {
        return schedule_end;
    }

    public void setSchedule_end(Time schedule_end) {
        this.schedule_end = schedule_end;
    }

}
