package com.example.demo.service;

import com.example.demo.entity.Product;
import java.util.List;

public interface ProductService {
    // 全件取得
    List<Product> getAllProducts();
    // 新規登録
    void createProduct(Product product);
}