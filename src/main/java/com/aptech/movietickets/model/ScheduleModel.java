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
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduleModel(Double vip_ticket, Double normal_ticket, Date schedule_date, Time schedule_start, String movie_name, String room_name) {
        this.vip_ticket = vip_ticket;
        this.normal_ticket = normal_ticket;
        this.schedule_date = schedule_date;
        this.schedule_start = schedule_start;
        this.movie_name = movie_name;
        this.room_name = room_name;
    }

    public ScheduleModel() {
    }

    public ScheduleModel(int movie_id, int room_id, Double vip_ticket, Double normal_ticket, Date schedule_date, Time schedule_start) {
        this.movie_id = movie_id;
        this.room_id = room_id;
        this.vip_ticket = vip_ticket;
        this.normal_ticket = normal_ticket;
        this.schedule_date = schedule_date;
        this.schedule_start = schedule_start;
    }

    //UI model
    private String movie_name;
    private String room_name;

    public String getMovie_name() {
        return movie_name;
    }

    public String getRoom_name() {
        return room_name;
    }

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

}
