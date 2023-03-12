package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.CustomerModel;
import java.util.List;

public interface ICustomerDAO {

    List<CustomerModel> findAll();

    int save(CustomerModel customerModel);

    void update(CustomerModel updateCustomer);

    void delete(int id);
    
    CustomerModel findOne(int id);
    
    CustomerModel findByPhoneNumber(String phone_number);
    
    int getTotalItem();

}
