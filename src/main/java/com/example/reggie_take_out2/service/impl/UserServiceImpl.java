package com.example.reggie_take_out2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_take_out2.entity.User;
import com.example.reggie_take_out2.mapper.UserMapper;
import com.example.reggie_take_out2.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
