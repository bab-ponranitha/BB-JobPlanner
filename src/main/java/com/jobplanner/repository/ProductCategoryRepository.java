package com.jobplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobplanner.entity.RefProductCategory;

@Repository
public interface ProductCategoryRepository extends JpaRepository<RefProductCategory, Integer>{

}
