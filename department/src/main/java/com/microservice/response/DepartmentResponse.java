package com.microservice.response;

import com.microservice.entity.Department;

public class DepartmentResponse {

	private long departid;

	private String name;

	private String city;
	
	public DepartmentResponse(Department department) {
		this.departid = department.getId();
		this.name = department.getName();
		this.city = department.getCity();
	}

	public long getAddressId() {
		return departid;
	}

	public void setAddressId(long departid) {
		this.departid = departid;
	}

	public String getStreet() {
		return name;
	}

	public void setStreet(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
