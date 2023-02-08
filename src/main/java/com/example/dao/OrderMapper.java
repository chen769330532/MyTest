package com.example.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.OrderTest;

/**
* @author Administrator
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-02-08 16:39:54
* @Entity generator.domain.Order
*/
public interface OrderMapper extends BaseMapper<OrderTest> {

    void insertTest(OrderTest order);
}




