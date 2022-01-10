package com.java.ex;

public class FirstClass {

	public FirstClass() {
		SingletonClass sgtClass = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i = " +sgtClass.getI());
		sgtClass.setI(200);
		System.out.println("i = " +sgtClass.getI());
		
	}

}
