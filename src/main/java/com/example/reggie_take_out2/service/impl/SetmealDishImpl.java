package com.example.reggie_take_out2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_take_out2.entity.SetmealDish;
import com.example.reggie_take_out2.mapper.SetmealDishMapper;
import com.example.reggie_take_out2.service.SetmealDishService;
import com.example.reggie_take_out2.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealDishImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
