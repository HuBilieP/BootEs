package com.laoxing.es.service.impl;

import com.laoxing.es.dao.FoodDao;
import com.laoxing.es.entity.Food;
import com.laoxing.es.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @program: BootEs
 * @description:
 * @author: Feri
 * @create: 2020-02-24 16:48
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao dao;
    @Override
    public void save(Food food) {
        dao.save(food);
    }
    @Override
    public Iterable<Food> queryAll() {
        return dao.findAll();
    }
}
