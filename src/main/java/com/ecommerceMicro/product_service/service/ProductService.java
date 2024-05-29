package com.ecommerceMicro.product_service.service;

import com.ecommerceMicro.product_service.dto.ProductRequest;
import com.ecommerceMicro.product_service.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();



}
