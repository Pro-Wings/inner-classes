package com.prowings.staticnestedclass;

public class Outer {
	
	private int data1 = 30;
	private static int data2 = 50;
	
	static class Inner{
		
		static void message()
		{
			Outer o = new Outer();
			System.out.println(o.data1);
			System.out.println(data2);
		}
		
	}

	public static void main(String[] args) {
		
//		Outer.Inner in = new Inner();
//		in.message();
		
		Outer.Inner.message();
		
	}
}
