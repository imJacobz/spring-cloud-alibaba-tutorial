package com.jacobz.nxauto.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.model.entity.Customer;
import com.jacobz.nxauto.customer.service.CustomerService;
import com.jacobz.nxauto.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

    @Override
    public Customer getById(Serializable id) {
        return super.getById(id);
    }
}




