package com.aptech.movietickets.model;

public class BookingModel extends BaseModel<BookingModel> {

    private int schedule_id;
    private int customer_id;
    private int seat_id;
    
    private String fullname;
    private String phone_number;
    private String seat_code;
    private String movie_schedule;

    public String getFullname() {
        return fullname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSeat_code() {
        return seat_code;
    }

    public String getMovie_schedule() {
        return movie_schedule;
    }

    public BookingModel(String fullname, String phone_number, String seat_code, String movie_schedule) {
        this.fullname = fullname;
        this.phone_number = phone_number;
        this.seat_code = seat_code;
        this.movie_schedule = movie_schedule;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public BookingModel() {
    }

    public BookingModel(int schedule_id, int customer_id, int seat_id) {
        this.schedule_id = schedule_id;
        this.customer_id = customer_id;
        this.seat_id = seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

}
