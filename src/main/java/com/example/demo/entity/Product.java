package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.OffsetDateTime; 

/**
 * 商品マスタ Entity
 * OffsetDateTime: PostgreSQLのTIMESTAMPTZに対応。タイムゾーンを意識した基幹系設計。
 * カプセル化: Lombokの@Getter/@Setterを使用し、フィールドはprivateで保持。
 * クラス定義: MyBatisの制約（空のコンストラクタ必要）を考慮し、recordではなくclassを採用。
 * 厳密に時間を管理するため、OffsetDateTimeを使用。
 */
@Getter
@Setter
public class Product {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private String status;
    private OffsetDateTime discontinuedAt;
    private String discontinuedNote;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}