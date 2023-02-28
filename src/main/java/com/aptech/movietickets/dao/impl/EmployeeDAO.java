package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.IEmployeeDAO;
import com.aptech.movietickets.mapper.EmployeeMapper;
import com.aptech.movietickets.model.EmployeeModel;
import java.util.List;

public class EmployeeDAO extends BaseDAO<EmployeeModel> implements IEmployeeDAO {

    @Override
    public EmployeeModel findByUsernameAndPassword(String username, String pwd) {
        String sql = "SELECT * FROM employee WHERE username = ? AND password = ?";
        List<EmployeeModel> employees = query(sql, new EmployeeMapper(), username, pwd);
        return employees.isEmpty() ? null : employees.get(0);
    }
}
