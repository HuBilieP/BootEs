package com.laoxing.es.controller;

import com.laoxing.es.entity.Food;
import com.laoxing.es.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BootEs
 * @description:
 * @author: Feri
 * @create: 2020-02-24 16:50
 */
@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

    //查询全部
    @GetMapping("/api/food/all.do")
    public Iterable<Food> all(){
        return foodService.queryAll();
    }
    //新增
    @GetMapping("/api/food/save.do")
    public String save(Food food){
        foodService.save(food);
        return "OK";
    }
}
