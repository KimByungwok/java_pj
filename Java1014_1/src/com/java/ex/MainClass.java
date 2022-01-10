package com.java.ex;

public class MainClass {

	public static void main(String[] args) {
		
		/*ThreadTest th = new ThreadTest();   //쓰레드 테스트
		th.setName("쓰레드 생성");
		th.start();
		
		System.out.println(Thread.currentThread().getName()); //main
		System.out.println("메인 클래스");*/
		
		/*ThreadRunnable tr = new ThreadRunnable();	//쓰레드런에이블
		Thread thread = new Thread(tr,"쓰레드 생성");
		thread.start();
		
		System.out.println(thread.currentThread().getName()); //main
		System.out.println("메인 클래스 ");*/
		
		TestThread th = new TestThread(); // TestThread
		Thread th0 = new Thread(th,"첫 번? 쓰레드");
		Thread th1 = new Thread(th,"두 번? 쓰레드");
		th0.start();
		th1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("메인 클래스");
		
		/*TestThread th01 = new TestThread();
		TestThread th11 = new TestThread();
		
		Thread th0 = new Thread(th01,"첫 번? 쓰레드");
		Thread th1 = new Thread(th11,"두 번? 쓰레드");
		th0.start();
		th1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("메인 클래스");*/
		
		/*Synchronized syncth = new Synchronized();
		
		Thread th0 = new Thread(syncth,"첫 번? 쓰레드");
		Thread th1 = new Thread(syncth,"두 번? 쓰레드");
		th0.start();
		th1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("메인 클래스");*/
		
		
		//선거 개표 예제
		
		
		}
}
