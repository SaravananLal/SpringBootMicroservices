package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.request.CreateDepartRequest;
import com.microservice.response.DepartmentResponse;
import com.microservice.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/create")
	public DepartmentResponse createAddress (@RequestBody CreateDepartRequest createDepartRequest) {
		return departmentService.createDepartment(createDepartRequest);
	}
	
	@GetMapping("/getById/{id}")
	public DepartmentResponse getById(@PathVariable long id) {
		return departmentService.getById(id);
	}
	
}
