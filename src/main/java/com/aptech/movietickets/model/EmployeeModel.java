package com.aptech.movietickets.model;

public class EmployeeModel extends BaseModel<EmployeeModel> {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public EmployeeModel() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
