package com.sample;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name:");
		String str = scan.next();
		Stack stk = new Stack();
		for(int i = 0;i < str.length();i++) {
			stk.push(str.charAt(i));
		}
		
		while(!stk.isEmpty()) {
			reverse += stk.pop();
		}
		
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else  {
			System.out.println("Not Palindrome");
		}
	}

}
