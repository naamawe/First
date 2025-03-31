package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.service.impl.DishServiceImpl;

public interface DishService {

    /**
     * 添加菜品和口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
