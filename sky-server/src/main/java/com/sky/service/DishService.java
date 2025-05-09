package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.service.impl.DishServiceImpl;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /**
     * 添加菜品和口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查找菜品
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品信息和口味
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 根据分类id返回菜品信息
     * @param categoryId
     * @return
     */
    List<Dish> getByCategoryId(Long categoryId);

    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);

    /**
     * 菜品起售停售
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

}
