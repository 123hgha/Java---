package com.example.reggie_take_out2.dto;

import com.example.reggie_take_out2.entity.Dish;
import com.example.reggie_take_out2.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
