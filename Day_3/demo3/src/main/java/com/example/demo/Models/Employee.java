package com.example.demo.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Employee_new")
public class Employee {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="Name")
	private String employeeName;
	
	@Column(name="age")
	private int employeeAge;
	
	@Column(name="salary")
	private long salary;
	
	public Employee() {}
	
	public Employee(int id,String name,int ag,long sal)
	{
		super();
		this.id=id;
		employeeName=name;
		employeeAge=ag;
		salary=sal;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return employeeName;
	}
	public void setName(String name)
	{
		employeeName=name;
	}
	public int getAge()
	{
		return employeeAge;
	}
	public void setAge(int age)
	{
		this.employeeAge=age;
	}
	public long getSal()
	{
		return salary;
	}
	public void setSal(long sal)
	{
		salary=sal;
	}
	
}
