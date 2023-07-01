package com.example.reggie_take_out2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_take_out2.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
