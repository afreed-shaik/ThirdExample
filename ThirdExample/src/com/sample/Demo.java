package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(1);
//		list.add(4);
//		list.add(3);
//		list.add(5);
//		list.add(8);
//		Collections.sort(list,Collections.reverseOrder());
//		list.forEach(System.out::println);
//		list.add(10);
//		list.add(1);
//		list.add(4);
//		list.add(3);
//		list.add(5);
//		list.add(8);
//		list.add(8);
//		list.add(8);
//		list.add(10);
//		Set<Integer> set = new HashSet<>(list);
//		set.forEach(System.out::println);
		
//		ListIterator lt = list.listIterator();
//		while(lt.hasNext()) {
//			System.out.println(lt.next());
//		}
//		System.out.println("******");
//		while(lt.hasPrevious()) {
//			System.out.println(lt.previous());
//		}
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ramu");
		ts.add("Anusha");
		ts.add("Bhanu");
		ts.add("Ramu");
		ts.add("Dhana");
		ts.forEach(System.out::println);
	}

}
