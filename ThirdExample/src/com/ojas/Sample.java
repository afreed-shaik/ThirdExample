package com.ojas;


class Test implements Cloneable{
	static Test t = null;
	private Test() {
		System.out.println("Defaule Constructor");
	}
	
//	factory method - static method and returns current class object
	
	public static Test getInstance() {
		if(t == null) {
			t = new Test();
		}
		return t;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Unable to create an object");
	}
	
	void disp() {
		System.out.println("Welcome");
	}
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = Test.getInstance();
		obj.disp();
		
		Test obj1 = Test.getInstance();
		obj1.disp();
		
		try {
			Test t = (Test)obj1.clone();
			t.disp();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
