package com.example.reggie_take_out2.dto;

import com.example.reggie_take_out2.entity.Setmeal;
import com.example.reggie_take_out2.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
