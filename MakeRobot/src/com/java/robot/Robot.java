package com.java.robot;

import com.java.ex.action.*;



public abstract class Robot {
	Missile missile;
	Fly fly;
	SwordAction sword;
	
	public abstract void Shape();
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	public void setMissile(Missile missile) {
		this.missile = missile;
	}
	public void setSword(SwordAction sword){
		this.sword = sword;
	}
	public void Missile() {
		this.missile.Missile();
	}
	public void Fly() {
		this.fly.Fly();
	}
	public void Sword() {
		this.sword.Sword();
	}
	
	public void walk() {
		System.out.println("걷기 : O");
	}
	public void run() {
		System.out.println("달리기 : O");
	}
	
}


