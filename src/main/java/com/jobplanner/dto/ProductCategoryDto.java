package com.jobplanner.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductCategoryDto {
	private int id;
	private String name;
	private Boolean active;
}
