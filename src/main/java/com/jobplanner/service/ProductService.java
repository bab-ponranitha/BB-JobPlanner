package com.jobplanner.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplanner.dto.ProductCategoryDto;
import com.jobplanner.entity.RefProductCategory;
import com.jobplanner.repository.ProductCategoryRepository;

@Service
public class ProductService {
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	public ProductCategoryDto saveProductCategory(ProductCategoryDto productCategoryDto) {
		RefProductCategory productCategoryToSave=new RefProductCategory();
		productCategoryToSave.setName(productCategoryDto.getName());
		productCategoryToSave.setActive(productCategoryDto.getActive());
		RefProductCategory refProductCategory = productCategoryRepository.save(productCategoryToSave);
		BeanUtils.copyProperties(refProductCategory, productCategoryDto);
		return productCategoryDto;
	}
}
