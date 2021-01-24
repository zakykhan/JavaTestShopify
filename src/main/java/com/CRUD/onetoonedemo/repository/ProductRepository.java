package com.CRUD.onetoonedemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.CRUD.onetoonedemo.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
