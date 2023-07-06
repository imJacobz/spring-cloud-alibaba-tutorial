package com.jacobz.nxauto.common.controller;

import com.jacobz.nxauto.common.service.CustomerService;
import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.common.model.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<ResponseData> getCustomerInfo(@PathVariable Integer id) {
        Customer customer = customerService.findById(id);
        return ResponseEntity.ok(new ResponseData().success().data(customer));
    }
}
