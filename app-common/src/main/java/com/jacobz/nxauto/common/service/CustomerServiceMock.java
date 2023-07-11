package com.jacobz.nxauto.common.service;

import com.jacobz.nxauto.common.entity.Customer;

public class CustomerServiceMock implements CustomerService{
    @Override
    public Customer findById(int id) {
        System.err.println("===fallback===");
        return new Customer(id, null,"AUSTIN");
    }
}
