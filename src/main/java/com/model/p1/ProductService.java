package com.model.p1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
	
	ArrayList<Product>products=new ArrayList<Product>();
	public List<Product>findAll()
	{
		
		products.add(new Product(100,"Mobile","CLK8965",9000.00));
		products.add(new Product(101,"LCD","CL899965",27000.00));
		products.add(new Product(102,"microwave","SLK8965",15000.00));
		products.add(new Product(103,"Mobile","CLK9965",1600.00));
		return products;
	}
  
        public Product viewById(int id) {
        	for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == (id)) {
                    return products.get(i);
                }
            }
            return null;
        }

		
		public Product saveProduct(Product product) {		
			        products.add(product);
			        return product;
			    }
		}
	
	


	

		

