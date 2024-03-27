package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.model.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ShopService extends IService<Shop> {
    List<Shop> showShopsForCustomer(Integer customerId, String token);
}
