package com.jacobz.nxauto.shop.controller;

import com.jacobz.nxauto.model.ResponseData;
import com.jacobz.nxauto.model.entity.Shop;
import com.jacobz.nxauto.shop.service.ShopService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {



    @Resource
    private ShopService shopService;

    @GetMapping("/shop/customer/{id}")
    public ResponseData<List<Shop>> showShopForCustomer(@PathVariable("id") Integer id,  @RequestHeader(name = "X-Auth-Token", required = false) String token) {
        List<Shop> shops = shopService.showShopsForCustomer(id, token);
        if(shops == null){
            return ResponseData.downgraded(null);
        }
        return ResponseData.success(shops);
    }

}
