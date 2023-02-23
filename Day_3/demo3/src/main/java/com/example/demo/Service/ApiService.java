package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	private EmployeeRepo emp;
	
	public Employee saveDetails1(Employee e)
	{
		return emp.save(e);
	}
	public Optional<Employee> getEmployeeById(int id)
	{
		return emp.findById(id);
	}
	public List<Employee> getAllDetails()
	{
		return emp.findAll();
	}
}
