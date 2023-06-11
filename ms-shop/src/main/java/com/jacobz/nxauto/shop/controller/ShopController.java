package com.jacobz.nxauto.shop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.common.entity.Shop;
import com.jacobz.nxauto.common.model.ResponseData;
import com.jacobz.nxauto.shop.service.CustomerService;
import com.jacobz.nxauto.shop.service.MockShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ShopController {

    private final CustomerService customerService;
    private final MockShopService mockShopService;

    @GetMapping("/shop/customer/{id}")
    public ResponseEntity<ResponseData> showShopForCustomer(@PathVariable Integer id) {
        ResponseData responseData = customerService.getCustomerById(id);
        // When you take responseData object, it's a LinkedHashMap, we use ObjectMapper to convert it.
        Customer customer = new ObjectMapper().convertValue(responseData.get("data"), Customer.class);
        String customerCity = customer.getCity();
        List<Shop> shops = mockShopService.mockShops().stream()
                .filter(shop -> shop.getCity().equalsIgnoreCase(customerCity)).toList();
        return ResponseEntity.ok(new ResponseData().success().data(shops));
    }

}
