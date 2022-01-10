package com.java.ex;

public class SingletonClass {  	   //멤버 변수
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
		
	private SingletonClass() {     //생성자
			
	}
	public static SingletonClass getSingletonClass() {  //다 멤버 메서드
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGLETON_CLASS_INSTANCE;
	}
		
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}


