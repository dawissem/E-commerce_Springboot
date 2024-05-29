package com.ecommerceMicro.product_service.repository;

import com.ecommerceMicro.product_service.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

// la classe Produit offre de smethode sCRUD et dauteres operatuios courantes pour interagir avec mongodb
public interface ProductRepository extends MongoRepository<Product,String> {
}
