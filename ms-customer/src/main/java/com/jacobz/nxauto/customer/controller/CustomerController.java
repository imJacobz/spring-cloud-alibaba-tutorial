package com.jacobz.nxauto.customer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jacobz.nxauto.customer.service.CustomerService;
import com.jacobz.nxauto.model.ResponseData;
import com.jacobz.nxauto.model.entity.Customer;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {

    @Value("${server.port}")
    private Integer serverPort;
    @Resource
    private CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseData<Customer> getCustomerInfo(@PathVariable("id") Integer id) {
        Customer customer = customerService.getById(id);
        return ResponseData.success(customer).setMessage("success on: " + serverPort);
    }

    @GetMapping("/customer")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseData<Page<Customer>> getCustomers(@RequestParam(required = false, defaultValue = "1") Integer page,
                                                     @RequestParam(required = false, defaultValue = "10") Integer size) {
        Page<Customer> pager = new Page<>();
        pager.setCurrent(page);
        pager.setSize(size);
        var cusList = customerService.page(pager);
        return ResponseData.success(cusList);
    }
}
