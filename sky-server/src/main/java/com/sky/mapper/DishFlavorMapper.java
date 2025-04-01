package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     * 批量插入口味数据
     * @param flavors 菜品口味
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味
     * @param DishId 菜品id
     */
    @Delete("delete from sky_take_out.dish_flavor where dish_id = #{DishId}")
    void deleteByDishId(Long DishId);
}
