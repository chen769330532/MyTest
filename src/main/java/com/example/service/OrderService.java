package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.OrderTest;

/**
* @author Administrator
* @description 针对表【order】的数据库操作Service
* @createDate 2023-02-08 16:39:54
*/
public interface OrderService extends IService<OrderTest> {

    Long createOrder(OrderTest order);

    Boolean payOrder(Long orderId);
}
