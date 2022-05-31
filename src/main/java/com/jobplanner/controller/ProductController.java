package com.jobplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobplanner.dto.ProductCategoryDto;
import com.jobplanner.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product-category")
	public ResponseEntity<ProductCategoryDto> saveProductCategory(@RequestBody ProductCategoryDto productCategoryDto){
		ProductCategoryDto productCategoryDtoRes=productService.saveProductCategory(productCategoryDto);
		return new ResponseEntity<ProductCategoryDto>(productCategoryDtoRes, HttpStatus.ACCEPTED);
	}
	
}
