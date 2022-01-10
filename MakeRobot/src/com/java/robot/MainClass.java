package com.java.robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("슈퍼 로봇 생성");
		Robot sr = new SuperRobot();
		sr.Shape();
		sr.walk();
		sr.run();
		sr.Fly();
		sr.Missile();
		sr.Sword();
		
		
		System.out.println("스탠다드 로봇 생성");
		Robot st = new StandardRobot();
		st.Shape();
		st.walk();
		st.run();
		st.Fly();
		st.Missile();
		st.Sword();
		
		System.out.println("값싼 로봇 생성");
		Robot cheap = new CheapRobot();
		cheap.Shape();
		cheap.walk();
		cheap.run();
	}
}
