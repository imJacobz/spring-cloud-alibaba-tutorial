package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.common.model.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nx-auto-ms-customer",fallback = CustomerServiceFallback.class)
@Primary
public interface CustomerService {
    @GetMapping("/customer/{id}")
    ResponseData getCustomerById(@PathVariable("id") Integer id) ;
}
