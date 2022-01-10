package com.java.robot;

import com.java.ex.action.*;

public class SuperRobot extends Robot {
	public SuperRobot(){
		fly = new FlyOK();
		missile = new MissileOK();
		sword = new SwordLaser();
		System.out.println("머리 몸통 다리 팔 조립 완료!");
	}
	@Override
	public void Shape() {
		System.out.println("Super Class 로봇 생성");
	}
}
