package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.EmployeeModel;
import java.sql.ResultSet;

public class EmployeeMapper implements Rowmapper<EmployeeModel> {
    
    @Override
    public EmployeeModel mapRow(ResultSet rs) {
        try {
            EmployeeModel employee = new EmployeeModel();
            employee.setId(rs.getInt("id"));
            employee.setUsername(rs.getString("username"));
            employee.setPassword(rs.getString("password"));
            return employee;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
}
