package com.ecommerceMicro.product_service.Model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data


@Builder

@Document(value="product")

public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}

