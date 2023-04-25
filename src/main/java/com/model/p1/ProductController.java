package com.model.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping(value="/product")
	public List<Product>getProduct(){
		List<Product>products=productService.findAll();
		return products;
	}
	
	@GetMapping(value="/product/{id}" ,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Product viewById(@PathVariable("id") int id) {
		Product prod = productService.viewById(id);
		return prod;
		
	}
		@PostMapping(value="/add")
		public Product saveProduct(@RequestBody Product product) {
			return productService.saveProduct(product);
	} 
	}


