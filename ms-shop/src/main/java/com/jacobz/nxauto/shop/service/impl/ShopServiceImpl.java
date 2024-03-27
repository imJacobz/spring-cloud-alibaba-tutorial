package com.jacobz.nxauto.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.nxauto.feign.CustomerInfoFeignApi;
import com.jacobz.nxauto.mapper.ShopMapper;
import com.jacobz.nxauto.model.ResponseData;
import com.jacobz.nxauto.model.ReturnCode;
import com.jacobz.nxauto.model.entity.Customer;
import com.jacobz.nxauto.model.entity.Shop;
import com.jacobz.nxauto.shop.service.ShopService;
import io.seata.spring.annotation.GlobalTransactional;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop>
    implements ShopService {
    @Resource
    private CustomerInfoFeignApi customerInfoFeignApi;
    @Override
    @GlobalTransactional(name = "show-shops-for-customer",rollbackFor = Exception.class) // AT
    //@GlobalTransactional @Transactional(rollbackFor = Exception.class) //XA
    public List<Shop> showShopsForCustomer(Integer customerId, String token) {
        ResponseData<?> responseData = customerInfoFeignApi.getCustomerById(customerId, token);

        if(responseData.getCode().equals(ReturnCode.SERVICE_DOWNGRADED.getCode())){
            return null;
        }
        // message from provider to check loadbalancer
        String msg = responseData.getMessage();
        log.info(":::lb:::"+msg);

        // When you take responseData object, it's a LinkedHashMap, use ObjectMapper to convert it.
        Customer customer = new ObjectMapper().convertValue(responseData.getData(), Customer.class);
        String customerCity = customer.getCity();
        QueryWrapper<Shop> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("city", customerCity);
        return this.list(queryWrapper);
    }
}




