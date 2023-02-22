package com.aptech.movietickets.model;

public class RoomModel extends BaseModel<RoomModel> {

    private String room_name;

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    @Override
    public String toString() {
        return room_name;
    }

    
}
