package com.walbety.micros.app.repository;

import com.walbety.micros.app.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface ProductRepository extends MongoRepository<Product, String> {
}
