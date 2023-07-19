package com.jacobz.nxauto.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.common.entity.Customer;
import com.jacobz.nxauto.customer.service.CustomerService;
import com.jacobz.nxauto.common.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author jacob
* @description 针对表【app_customer】的数据库操作Service实现
* @createDate 2023-07-18 10:56:16
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

}




