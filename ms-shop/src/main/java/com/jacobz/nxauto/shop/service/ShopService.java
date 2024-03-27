package com.jacobz.nxauto.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacobz.nxauto.model.entity.Shop;

import java.util.List;

public interface ShopService extends IService<Shop> {
    List<Shop> showShopsForCustomer(Integer customerId, String token);
}
