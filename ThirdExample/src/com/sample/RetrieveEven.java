package com.sample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class RetrieveEven {

	
	public Vector<Integer> displayEven(int sValue, int eValue) {
		Vector<Integer> vi = new Vector<Integer>();
		for(int i = sValue; i <= eValue;i++) {
			if(i % 2 == 0) {
				vi.addElement(i);
			}
		}
		return vi;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start value:");
		int startValue = scan.nextInt();
		System.out.println("Enter end value:");
		int endValue = scan.nextInt();
		RetrieveEven re = new RetrieveEven();
		
		
		Vector<Integer> s = re.displayEven(startValue,endValue);
//		Iterator i = s.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		Enumeration<Integer> e1 = s.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
