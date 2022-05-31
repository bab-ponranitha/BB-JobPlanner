package com.jobplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobplanner.entity.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{
}
