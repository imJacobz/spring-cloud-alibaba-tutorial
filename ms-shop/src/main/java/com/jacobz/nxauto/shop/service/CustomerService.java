package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.common.model.ResponseData;
import com.jacobz.nxauto.shop.service.impl.CustomerServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "nx-auto-ms-customer",fallback = CustomerServiceFallback.class)
@Primary
public interface CustomerService {
    @GetMapping("/api/v1/customer/{id}")
    ResponseData getCustomerById(@PathVariable("id") Integer id,@RequestHeader(name = "X-Auth-Token") String token);
}
