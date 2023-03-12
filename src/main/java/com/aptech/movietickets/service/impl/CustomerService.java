package com.aptech.movietickets.service.impl;

import com.aptech.movietickets.dao.IBookingDAO;
import com.aptech.movietickets.dao.ICustomerDAO;
import com.aptech.movietickets.dao.impl.BookingDAO;
import com.aptech.movietickets.dao.impl.CustomerDAO;
import com.aptech.movietickets.model.BookingModel;
import com.aptech.movietickets.model.CustomerModel;
import com.aptech.movietickets.service.ICustomerService;
import com.aptech.movietickets.utils.DisplayUtil;
import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerDAO customerDAO = new CustomerDAO();
    private IBookingDAO bookingDAO = new BookingDAO();

    @Override
    public CustomerModel save(CustomerModel customerModel) {
        customerModel.setCreatedDate(DisplayUtil.getTimeStampNow());
        int customer_id = customerDAO.save(customerModel);
        return customerDAO.findOne(customer_id);
    }

    @Override
    public CustomerModel update(CustomerModel updateCustomer) {
        CustomerModel oldCustomer = customerDAO.findOne(updateCustomer.getId());
        updateCustomer.setCreatedDate(oldCustomer.getCreatedDate());
        updateCustomer.setModifiedDate(DisplayUtil.getTimeStampNow());
        customerDAO.update(updateCustomer);
        return customerDAO.findOne(updateCustomer.getId());
    }

    @Override
    public List<CustomerModel> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public boolean delete(int id) {
        BookingModel bookingModel = bookingDAO.findByCutomerId(id);
        if (bookingModel == null) {
            customerDAO.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public int getTotalItem() {
        return customerDAO.getTotalItem();
    }

    @Override
    public CustomerModel findOne(int id) {
        return customerDAO.findOne(id);
    }

    @Override
    public CustomerModel findByPhoneNumber(String phone_number) {
        return customerDAO.findByPhoneNumber(phone_number);
    }

}
