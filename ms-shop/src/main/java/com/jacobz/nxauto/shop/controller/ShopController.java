package com.jacobz.nxauto.shop.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.common.entity.Shop;
import com.jacobz.nxauto.common.model.ResponseData;
import com.jacobz.nxauto.shop.service.CustomerService;
import com.jacobz.nxauto.shop.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ShopController {

    private final CustomerService customerService;
    private final ShopService shopService;

    @GetMapping("/shop/customer/{id}")
    public ResponseEntity<ResponseData> showShopForCustomer(@PathVariable Integer id,
                                                            @RequestHeader(name = "X-Auth-Token") String token) {
        ResponseData responseData = customerService.getCustomerById(id, token);
        // When you take responseData object, it's a LinkedHashMap, we use ObjectMapper to convert it.
        Customer customer = new ObjectMapper().convertValue(responseData.get("data"), Customer.class);
        String customerCity = customer.getCity();
        QueryWrapper<Shop> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("city", customerCity);
        List<Shop> shops = shopService.list(queryWrapper);
        return ResponseEntity.ok(new ResponseData().success().data(shops));
    }

}
