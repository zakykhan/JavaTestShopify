package com.CRUD.onetoonedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.CRUD.onetoonedemo.entity.Variant;

@Repository
public interface VariantRepository extends CrudRepository<Variant, Long>{

}
