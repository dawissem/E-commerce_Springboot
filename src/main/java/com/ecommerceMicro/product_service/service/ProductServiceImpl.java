package com.ecommerceMicro.product_service.service;

import com.ecommerceMicro.product_service.Model.Product;
import com.ecommerceMicro.product_service.dto.ProductResponse;
import com.ecommerceMicro.product_service.repository.ProductRepository;
import com.ecommerceMicro.product_service.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

@Override
    public ProductResponse createProduct(ProductRequest productRequest) {

        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        //log statment
        log.info("Product{} is saved", product.getId());
        return new ProductResponse(product.getId(), product.getName(),product.getDescription(),product.getPrice());

    }


    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().
                stream()
                .map(product -> new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice())).toList();

    }
}

