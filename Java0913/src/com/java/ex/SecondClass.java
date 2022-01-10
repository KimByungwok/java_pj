package com.java.ex;

public class SecondClass {
	public SecondClass() {
		SingletonClass sgtClass = SingletonClass.getSingletonClass();
		System.out.println("SecondClass");
		System.out.println("i ="+sgtClass.getI());
	}
}
