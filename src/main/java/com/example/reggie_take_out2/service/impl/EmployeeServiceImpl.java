package com.example.reggie_take_out2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_take_out2.entity.Employee;
import com.example.reggie_take_out2.mapper.EmployeeMapper;
import com.example.reggie_take_out2.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
