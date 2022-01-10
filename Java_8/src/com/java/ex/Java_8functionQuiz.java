package com.java.ex;

import java.util.Scanner;

/* 객체지향과 메서드(함수)의 역할과 개념
 * 메서드(=함수)는 F(x) 로 생겼다 저게 Main(F) (String[] args)= (x), args는 아규먼츠s 
 * 함수 앞에 붙는 데이터 타입은 리턴값에 대한 데이터 타입을 적는다.
 * 리턴값이 없으면 void , 리턴값이 있으면 int 같은 데이터 타입을 적어야 함

// 메인 클래스에서 함수를 호출해서 몇단 입력하면 해당 단을 출력하는 프로그램 생성 */

public class Java_8functionQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = scanner.nextInt();
		
		Java_8functionQuiz.returncal(num);
		
		scanner.close();
	}
	
	public static int returncal (int x) {
		for (int a = 1; a < 10; a++) {
			System.out.println(x + "*" + a + "= " + (x*a));
		}
		return x;
		
	}
}