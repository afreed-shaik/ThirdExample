package com.ojas;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int eNo;
	private String eName;
	private double eSalary;
	
	public Employee() {
		super();
	}

	public Employee(int eNo, String eName, double eSalary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

class ListOperations {
	List<Employee> list;
	ListOperations() {
		list = new ArrayList<>();
	}
	
	void addEmployee(Employee e) {
		list.add(e);
		System.out.println("Added Successfully");
	}
	
	void deleteEmployee(int num) {
		list.remove(--num);
		System.out.println("Deleted Successfully");
	}
	
	void updateEmployee(int ind, Employee e) {
		list.set(--ind,  e);
		System.out.println("Updated Successfully");
	}
	
	void listEmployee() {
		System.out.println("Employee info");
		for(Employee e : list) {
			System.out.println(e.toString());
		}
	}
	
	void menu() {
		String m = "Menu Driven Application\n";
		m += "1.Add Employee\n";
		m += "2.Delete Employee\n";
		m += "3.Update Employee\n";
		m += "4.List Employee\n";
		m += "1.Add Employee\n";
		m += "1.Add Employee\n";
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
