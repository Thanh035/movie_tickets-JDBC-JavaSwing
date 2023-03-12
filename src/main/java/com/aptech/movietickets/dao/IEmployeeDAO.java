package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.EmployeeModel;

public interface IEmployeeDAO {

    EmployeeModel findByUsernameAndPassword(String username, String pwd);
}
