package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.microservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
