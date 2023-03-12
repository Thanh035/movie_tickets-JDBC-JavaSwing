package com.aptech.movietickets.service;

import com.aptech.movietickets.model.CustomerModel;
import java.util.List;

public interface ICustomerService {

    CustomerModel save(CustomerModel customerModel);

    CustomerModel update(CustomerModel updateCustomer);

    List<CustomerModel> findAll();

    boolean delete(int id);

    int getTotalItem();

    CustomerModel findOne(int id);

    CustomerModel findByPhoneNumber(String phone_number);
}
