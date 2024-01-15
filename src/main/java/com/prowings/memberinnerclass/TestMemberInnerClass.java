package com.prowings.memberinnerclass;

public class TestMemberInnerClass {
	
	public static void main(String[] args) {
		
//		TestMemberOuter out = new TestMemberOuter();
//		Outer.Inner in = out.new Inner();
		
		TestMemberOuter.Inner in = new TestMemberOuter().new Inner();
		
		in.message();
		
	}

}
