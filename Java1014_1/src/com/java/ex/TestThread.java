package com.java.ex;

public class TestThread implements Runnable {
	
	int num =0;
	
	@Override
	public void run() {
		for (int i =0;i<10;i++) {
			if(Thread.currentThread().getName().equals("첫 번째 쓰레드"));
			System.out.println("==============================");
			num++;
		}
		System.out.println("쓰레드 이름 : "+Thread.currentThread().getName()+",테스트 숫자: "+num);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
