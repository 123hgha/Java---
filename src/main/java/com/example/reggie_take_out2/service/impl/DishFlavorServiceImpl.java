package com.example.reggie_take_out2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_take_out2.entity.DishFlavor;
import com.example.reggie_take_out2.mapper.DishFlavorMapper;
import com.example.reggie_take_out2.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService{
}
