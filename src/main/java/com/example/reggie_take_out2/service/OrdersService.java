package com.example.reggie_take_out2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_take_out2.entity.Orders;

public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
