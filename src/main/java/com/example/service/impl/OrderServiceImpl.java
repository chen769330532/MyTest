package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.OrderMapper;
import com.example.pojo.OrderTest;
import com.example.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

/**
* @author Administrator
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-02-08 16:39:54
*/
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderTest> implements OrderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public Long createOrder(OrderTest order) {
        Date now = new Date();
        order.setCreatTime(now);
        order.setUpdateTime(now);
        order.setOrderStatus(0);
        baseMapper.insert(order);

        Long orderId = order.getId();
        log.info("发送时间:{},发送内容:{}", LocalDateTime.now(), orderId);
        this.rabbitTemplate.convertAndSend(
                "normal_exchange",
                "normal_routingkey",
                orderId,
                message -> {
                    message.getMessageProperties().setExpiration("3000");
                    return message;
                }
        );
        return orderId;
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




