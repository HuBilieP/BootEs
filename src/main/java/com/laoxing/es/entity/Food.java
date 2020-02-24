package com.laoxing.es.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @program: BootEs
 * @description:
 * @author: Feri
 * @create: 2020-02-24 16:42
 */
//文档 标记在es中存储的索引名称和对应的类型名称
@Document(indexName = "nz1906",type = "food")
@Data
public class Food {
    @Id //标记唯一字段
    private Integer id;
    private String name;
    private String info;
}