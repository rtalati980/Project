package com.model.p1;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

public interface IProductService  {

	List<Product> findAll();
	
	Product viewById(int id);

	Product saveProduct(Product product);
}
