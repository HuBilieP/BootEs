package com.laoxing.es.service;

import com.laoxing.es.entity.Food;

import java.util.List;

/**
 * @program: BootEs
 * @description:
 * @author: Feri
 * @create: 2020-02-24 16:47
 */
public interface FoodService {
    //新增 数据 ---ES
    void save(Food food);
    //查询 ---ES
    Iterable<Food> queryAll();
}
