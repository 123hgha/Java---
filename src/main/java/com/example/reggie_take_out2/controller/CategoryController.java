package com.example.reggie_take_out2.controller;

import org.apache.commons.lang.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.reggie_take_out2.common.R;
import com.example.reggie_take_out2.entity.Category;
import com.example.reggie_take_out2.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    /*
    新增分类
     */
    @PostMapping
    public R<String> save(@RequestBody Category category){
        log.info("category:{}", category);
        categoryService.save(category);
        return R.success("新增分类成功");
    }

    /*
    分页查询
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name){

        Page<Category> pageInfo = new Page<>(page, pageSize);

        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.like(StringUtils.isNotEmpty(name), Category::getName, name);

        queryWrapper.orderByDesc(Category::getSort);

        categoryService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }

    /*
    根据id删除分类
     */
    @DeleteMapping
    public R<String> delete(Long id){
        log.info("删除分类，id为：{}", id);

        categoryService.removeById(id);
        return R.success("分类信息删除成功");
    }

    /*
    根据id修改分类信息
     */
    @PutMapping
    public R<String> update(@RequestBody Category category){
        log.info("修改分类信息：{}", category);

        categoryService.updateById(category);
        return R.success("修改分类信息成功");
    }

    /*
    根据条件查询分类数据
     */
    public R<List<Category>> list(Category category){
        // 条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        // 添加条件
        queryWrapper.eq(category.getType() != null,Category::getType, category.getType());
        // 添加排序条件
        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);

        List<Category> list = categoryService.list(queryWrapper);

        return R.success(list);
    }
}
