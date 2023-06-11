package com.jacobz.nxauto.common.service;

import com.jacobz.nxauto.common.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MockService {

    public Map<Integer, Customer> mockData(){
        Map<Integer,Customer> map = new HashMap<>();
        map.put(1, new Customer(1,"Jacob","AUSTIN"));
        map.put(2, new Customer(2,"Leah","AUSTIN"));
        map.put(3, new Customer(3, "Ben", "DALLAS"));
        return map;
    }
}
