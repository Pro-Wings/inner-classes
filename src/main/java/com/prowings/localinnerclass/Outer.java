package com.prowings.localinnerclass;

public class Outer {
	
	private int data = 30;
	
	public void dispay()
	{
		
		System.out.println("display method started!!");
		final int i = 20;
		//local inner class
		class Inner{
			public void message()
			{
				System.out.println("inside message() method of inner class!!");
				System.out.println(i);
			}
		}
		
		Inner in = new Inner();
		in.message();
		System.out.println("display method ended!!");
	}
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.dispay();
		
	}

}
