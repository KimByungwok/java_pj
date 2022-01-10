package com.java.robot;

import com.java.ex.action.*;

public class StandardRobot extends Robot{
	public StandardRobot(){
		fly = new FlyNO();
		missile = new MissileOK();
		sword = new SwordIron();
		System.out.println("머리 몸통 다리 팔 조립 완료!");
	}
	@Override
	public void Shape() {
		System.out.println("Standard Class 로봇 생성");
	}
}
