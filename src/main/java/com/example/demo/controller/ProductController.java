package com.example.demo.controller;
import jakarta.validation.Valid;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService; 
import lombok.RequiredArgsConstructor;           
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor // ★1: これを追加（Serviceを自動でセットするため）
public class ProductController {

    // ★2: Serviceを呼び出すための定義
    private final ProductService productService;

    /**
     * 商品一覧取得
     * Serviceを呼び出してDBから本物のデータを取ります
     */
    @GetMapping
    public List<Product> list() {
        return productService.getAllProducts(); // ★3: 修正
    }

    /**
     * 商品登録
     * Serviceを呼び出してDBに保存します
     */
    @PostMapping
    public void create(@Valid @RequestBody Product product) {
        productService.createProduct(product); // ★4: 修正
    }
}