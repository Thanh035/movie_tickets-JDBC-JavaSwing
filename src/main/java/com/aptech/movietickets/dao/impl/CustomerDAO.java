package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.ICustomerDAO;
import com.aptech.movietickets.mapper.CustomerMapper;
import com.aptech.movietickets.model.CustomerModel;
import java.util.List;

public class CustomerDAO extends BaseDAO<CustomerModel> implements ICustomerDAO {

    @Override
    public List<CustomerModel> findAll() {
        String sql = "SELECT * FROM customer";
        return query(sql, new CustomerMapper());
    }

    @Override
    public int save(CustomerModel customerModel) {
        String sql = "INSERT INTO customer (fullname,phone_number,point,created_date) VALUES (?, ?, ?, ?)";
        return insert(sql,
                customerModel.getFullname(),
                customerModel.getPhone_number(),
                customerModel.getPoint(),
                customerModel.getCreatedDate());
    }

    @Override
    public void update(CustomerModel updateCustomer) {
        String sql = "UPDATE `customer` SET fullname = ?, phone_number = ?, point = ?,created_date = ?,modified_date = ? WHERE id = ?";
        update(sql,
                updateCustomer.getFullname(),
                updateCustomer.getPhone_number(),
                updateCustomer.getPoint(),
                updateCustomer.getCreatedDate(),
                updateCustomer.getModifiedDate(),
                updateCustomer.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM `customer` WHERE id = ?";
        update(sql, id);
    }

    @Override
    public CustomerModel findOne(int id) {
        String sql = "SELECt * FROM customer WHERE id = ?";
        List<CustomerModel> customers = query(sql, new CustomerMapper(), id);
        return customers.isEmpty() ? null : customers.get(0);
    }

    @Override
    public CustomerModel findByPhoneNumber(String phone_number) {
        String sql = "SELECt * FROM customer WHERE phone_number = ?";
        List<CustomerModel> customers = query(sql, new CustomerMapper(), phone_number);
        return customers.isEmpty() ? null : customers.get(0);
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM customer";
        return count(sql);
    }

}
