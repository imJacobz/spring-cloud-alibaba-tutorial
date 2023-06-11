package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.common.entity.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockShopService {
    public List<Shop> mockShops(){
        List<Shop> mockList = new ArrayList<>();
        mockList.add(new Shop(1, "Gold Car", "AUSTIN"));
        mockList.add(new Shop(2, "Gold Car", "DALLAS"));
        mockList.add(new Shop(3, "Car Fox", "AUSTIN"));
        mockList.add(new Shop(4, "Los Santos Customize", "AUSTIN"));
        mockList.add(new Shop(5, "Los Santos Customize", "DALLAS"));
        return mockList;
    }
}
