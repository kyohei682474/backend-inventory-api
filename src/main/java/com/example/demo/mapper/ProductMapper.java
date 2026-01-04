package com.example.demo.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductMapper {
    // 全件取得
    List<Product> findAll();
    
    // 新規登録
    void insert(Product product);
}