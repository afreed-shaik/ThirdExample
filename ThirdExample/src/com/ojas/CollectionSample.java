package com.ojas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
//		h.add("C");
//		h.add("D");
//		System.out.println(h.add("D"));;
//		System.out.println(h.add("D"));
//		System.out.println(h);
		
		
//		h.add("Afreed");
//		System.out.println("Afreed".hashCode());
//		h.add("Zakeer");
//		System.out.println("Zakeer".hashCode());
//		h.add("Zakeer");
//		h.add("Naresh");
//		h.add("Veeranji");
//		
//		Iterator<String> is = h.iterator();
//		while(is.hasNext()) {
//			System.out.println(is.next());
//		}
		
//		for(int i = 1;i <= 100; i++) {
//			h.add(i);
//		}
//		
//		Iterator<Integer> is = h.iterator();
//		while(is.hasNext()) {
//			int num = is.next();
//			if(num % 2 != 0) {
//				is.remove();
//			}
//		}
//		h.forEach(x-> System.out.println(x));
		
		List list = new ArrayList();
		System.out.println(list.size());
		list.add(10);
		list.add(true);
		list.add("ojas");
		list.add('c');
		list.add(10);
		System.out.println("Using for loop");
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Using forEach loop");
		for(Object x : list) {
			System.out.println(x);
		}
	}

}
