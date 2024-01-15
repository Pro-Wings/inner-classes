package com.prowings.annonymusinnerclass;

public class TestAnnonymusClass {
	
	public static void main(String[] args) {
		
		MyInterface obj1 = new MyInterface() {
			
			public void m1() {
				System.out.println("Inside m1() method!!");
			}
		};
		
		
		obj1.m1();
		

		MyAbClass obj2 = new MyAbClass() {
			
			@Override
			public void m2() {
				System.out.println("Inside m2() method!!");
			}
		};
		
		
		obj2.m2();
		obj2.m3();
	}

}
