package com.example.reggie_take_out2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_take_out2.entity.AddressBook;
import com.example.reggie_take_out2.mapper.AddressBookMapper;
import com.example.reggie_take_out2.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
