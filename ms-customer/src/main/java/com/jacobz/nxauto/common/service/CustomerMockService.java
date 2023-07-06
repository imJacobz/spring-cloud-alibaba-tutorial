package com.jacobz.nxauto.common.service;

import com.jacobz.nxauto.common.entity.Customer;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@DubboService
public class CustomerMockService implements CustomerService {

    public Map<Integer, Customer> mockData(){
        Map<Integer,Customer> map = new HashMap<>();
        map.put(1, new Customer(1,"Jacob","AUSTIN"));
        map.put(2, new Customer(2,"Leah","AUSTIN"));
        map.put(3, new Customer(3, "Ben", "DALLAS"));
        return map;
    }

    @Override
    public Customer findById(int id) {
        return this.mockData().get(id);
    }

}
