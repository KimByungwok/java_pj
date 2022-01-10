package com.java.ex;

public class ThreadTest extends Thread{
	@Override
	public void run() {	//Thread가 돌아갈 부분 구현
		System.out.println(Thread.currentThread().getName()); //setName
		System.out.println("쓰레드 클래스 상속 쓰레드");
		
		for(int i =0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
