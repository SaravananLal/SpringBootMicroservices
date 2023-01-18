package com.microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.entity.Department;
import com.microservice.repository.DepartmentRepository;
import com.microservice.request.CreateDepartRequest;
import com.microservice.response.DepartmentResponse;

@Service
public class DepartmentService {

	Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
      DepartmentRepository departmentRepository;

	public DepartmentResponse createDepartment(CreateDepartRequest createDepartRequest) {
		
		Department dept = new Department();
		dept.setName(createDepartRequest.getName());
		dept.setCity(createDepartRequest.getCity());
		
		departmentRepository.save(dept);
		
		return new DepartmentResponse(dept);
		
	}
	
	public DepartmentResponse getById (long id) {
		
		logger.info("Inside getById " + id);
		
		Department dept = departmentRepository.findById(id).get();
		
		return new DepartmentResponse(dept);
	}
	
}
