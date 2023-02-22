package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.CustomerModel;
import java.sql.ResultSet;

public class CustomerMapper implements Rowmapper<CustomerModel> {
    
    @Override
    public CustomerModel mapRow(ResultSet rs) {
        try {
            CustomerModel customer = new CustomerModel();
            customer.setId(rs.getInt("id"));
            customer.setFullname(rs.getString("fullname"));
            customer.setPhone_number(rs.getString("phone_number"));
            customer.setPoint(rs.getInt("point"));
            return customer;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
}
