package com.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;


class Employee implements Serializable{
	private int eid;
	private String ename;
	private double esalary;
	
	
	public Employee() {
		System.out.println("Default Constructor");
	}


	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = Arrays.asList("Afreed","zakeer","Naresh","Veeranji");
//		Stream<String> s = list.stream().sorted();
//  	List<String> l = s.map(x->x.toUpperCase()).collect(Collectors.toList());
//		s.forEach(x->System.out.println(x));
		
//		Integer num[] = new Integer[5];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 5 subject marks:");
//		for(int i = 0;i < num.length;i++) {
//			num[i] = scan.nextInt();
//		}
//		Stream<Integer> inStream = Stream.of(num);
//		inStream = inStream.sorted();
//		inStream.forEach(System.out::println);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Zakeer", 30000));
		list.add(new Employee(9, "Shaik", 25000));
		list.add(new Employee(3, "Naresh", 27000));
		list.add(new Employee(4, "Anji", 23000));
		list.add(new Employee(8, "Afreed", 20000));
		list.add(new Employee(6, "Pramod", 20000));
		list.add(new Employee(7, "JayaSimha", 15000));
		list.add(new Employee(3, "Anil", 15000));
		list.add(new Employee(2, "Jayasai", 15000));
		
//		list.forEach(x->System.out.println(x));
//		list.stream().filter(x->x.getEsalary() > 20000).
//		forEach(System.out::println);
		
//		list.stream().distinct().forEach(x->System.out.println(x));
		
//		list.stream().sorted((emp1,emp2)-> emp1.getEid() - (emp2.getEid())).
//				forEach(System.out::println);
		
		list.stream().sorted((emp1,emp2)-> emp1.getEname().
				compareTo(emp2.getEname())).
		forEach(System.out::println);
	}

}
