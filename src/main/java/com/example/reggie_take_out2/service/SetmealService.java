package com.example.reggie_take_out2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_take_out2.dto.SetmealDto;
import com.example.reggie_take_out2.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联关系
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
