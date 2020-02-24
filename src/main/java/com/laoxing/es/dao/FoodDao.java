package com.laoxing.es.dao;

import com.laoxing.es.entity.Food;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @program: BootEs
 * @description:
 * @author: Feri
 * @create: 2020-02-24 16:45
 */
public interface FoodDao extends ElasticsearchCrudRepository<Food,Integer> {
}
