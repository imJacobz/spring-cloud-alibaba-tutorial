package com.jacobz.nxauto.customer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jacobz.nxauto.customer.service.CustomerService;
import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.common.model.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<ResponseData> getCustomerInfo(@PathVariable Integer id) {
        Customer customer = customerService.getById(id);
        return ResponseEntity.ok(new ResponseData().success().data(customer));
    }

    @GetMapping("/customer")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<ResponseData> getCustomers(@RequestParam(required = false, defaultValue = "1") Integer page,
                                                     @RequestParam(required = false, defaultValue = "10") Integer size){
        Page<Customer> pager = new Page<>();
        pager.setCurrent(page);
        pager.setSize(size);
        var cusList = customerService.page(pager);
        return ResponseEntity.ok(new ResponseData().success().data(cusList));
    }
}
