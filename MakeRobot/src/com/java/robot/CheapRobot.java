package com.java.robot;

import com.java.ex.action.*;

public class CheapRobot extends Robot{
	public CheapRobot() {
		fly = new FlyNO();
		missile = new MissileNO();
		sword = new SwordNo();
		
		System.out.println("머리 몸통 다리 팔 조립 완료!");
	}
	@Override
	public void Shape() {
		System.out.println("LOW CLASS 로봇 생성");
	}
}

