package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	private ApiService empUser;
	@PostMapping("/")
	public boolean postDetails(@RequestBody Employee e)
	{
		return (empUser.saveDetails1(e) != null);
	}
	@GetMapping("/getEmployee")
	public List<Employee> getDetails()
	{
		return empUser.getAllDetails();
	}
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getDetails(@PathVariable int id)
	{
		return empUser.getEmployeeById(id);
	}

	
}
