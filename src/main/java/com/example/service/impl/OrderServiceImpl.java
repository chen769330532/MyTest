package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.OrderMapper;
import com.example.pojo.OrderTest;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author Administrator
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-02-08 16:39:54
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderTest> implements OrderService {

    @Override
    public Long createOrder(OrderTest order) {
        Date now = new Date();
        order.setCreatTime(now);
        order.setUpdateTime(now);
        order.setOrderStatus(0);
        baseMapper.insert(order);
        return order.getId();
    }

    @Override
    public Boolean payOrder(Long orderId) {
        OrderTest orderTest = new OrderTest();
        orderTest.setUpdateTime(new Date());
        orderTest.setId(orderId);
        orderTest.setOrderStatus(1);
        baseMapper.updateById(orderTest);
        return Boolean.TRUE;
    }
}




