package com.jacobz.nxauto.shop.service.impl;

import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.common.model.ResponseData;
import com.jacobz.nxauto.shop.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceFallback implements CustomerService {

    @Override
    public ResponseData getCustomerById(Integer id, String token) {
        System.err.println("[[this is fallback!]]");
        Customer temp = new Customer();
        temp.setCity("Austin");
        return new ResponseData().data(temp).msg("fallback").status(503);
    }
}
