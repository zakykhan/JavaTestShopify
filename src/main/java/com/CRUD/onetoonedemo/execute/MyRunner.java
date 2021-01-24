package com.CRUD.onetoonedemo.execute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.CRUD.onetoonedemo.entity.Product;
import com.CRUD.onetoonedemo.entity.Variant;
import com.CRUD.onetoonedemo.repository.ProductRepository;
import com.CRUD.onetoonedemo.repository.VariantRepository;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository pro;
	
	@Autowired
	private VariantRepository var;
	
	@Override
	public void run(String... args) throws Exception {
		pro.deleteAll();
		var.deleteAll();

	
	Product product = new Product("Iphone","Apple");
	
	Variant variant = new Variant((long) 1,"1000.12", (long) 1 , "xyz123");

	product.setVariant(variant);	
	variant.setProduct(product);
	pro.save(product);
	}

}
