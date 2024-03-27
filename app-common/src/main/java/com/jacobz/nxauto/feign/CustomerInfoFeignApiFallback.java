package com.jacobz.nxauto.feign;

import com.jacobz.nxauto.model.ResponseData;
import com.jacobz.nxauto.model.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerInfoFeignApiFallback implements CustomerInfoFeignApi {
    @Override
    public ResponseData<?> getCustomerById(Integer id, String token) {
        System.err.println("=============fallback!===========");
        Customer temp = new Customer();
        temp.setCity("Austin");
        return ResponseData.downgraded(temp);
    }
}
