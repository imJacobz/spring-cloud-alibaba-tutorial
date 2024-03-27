package com.jacobz.nxauto.feign;

import com.jacobz.nxauto.model.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "nx-auto-ms-customer",fallback = CustomerInfoFeignApiFallback.class)
@Primary
public interface CustomerInfoFeignApi {

    @GetMapping("/api/customer/{id}")
    ResponseData<?> getCustomerById(@PathVariable("id") Integer id, @RequestHeader(name = "X-Auth-Token", required = false) String token);
}
