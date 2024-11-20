package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    /**
     * 分类分页查询
     *
     * @param categoryPageQueryDTO
     * @return
     */
    //依然通过xml实现动态sql
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
}