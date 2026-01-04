package com.example.demo.controller;

import com.example.demo.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    /**
     * 商品一覧取得
     * ※現在はスタブ実装のため空リストを返します
     */
    @GetMapping
    public List<Product> list() {
        return new ArrayList<>();
    }

    /**
     * 商品登録
     * ※現在はスタブ実装のため受け取るだけです
     */
    @PostMapping
    public void create(@RequestBody Product product) {
        // TODO: Service層の実装後、保存処理を呼び出す
        System.out.println("商品の登録リクエストを受け付けました: " + product.getName());
    }
}
