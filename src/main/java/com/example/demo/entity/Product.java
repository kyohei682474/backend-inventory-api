package com.example.demo.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "SKUは必須です")
    @Size(max = 64, message = "SKUは64文字以内で入力してください")
    private String sku;
    @NotBlank(message = "商品名は必須です")
    @Size(max = 200, message = "商品名は200文字以内で入力してください")
    private String name;
    private String description;
    @NotBlank(message = "ステータスは必須です")
    @Pattern(regexp = "ACTIVE|INACTIVE", message = "ステータスはACTIVEまたはINACTIVEのいずれかである必要があります")
    private String status;
    private OffsetDateTime discontinuedAt;
    private String discontinuedNote;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    
}