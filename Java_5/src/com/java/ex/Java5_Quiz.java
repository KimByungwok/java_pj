package com.java.ex;

import java.util.Scanner;

// 자바 특강 5주차 연산자 퀴즈
// 사용자로부터 수를 입력 받고 그 수가 3의 배수인지 파악하는 프로그램

public class Java5_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해라: ");
		int i = sc.nextInt();
		
		System.out.print("입력한 수는: "+ i+ " 은 ");
		System.out.println(((i % 3)==0) ? "3의 배수" : "3의 배수 아님");	
		
		sc.close();
	}
}

// 문자열 - 자바의 문자열은 기본 자료형이 아닌 String 클래스로 구현되는 참조 자료형

/* 
 * 제어문 if, switch - 어떤 상황을 판단하여 결과를 true 나 false 를 반환
 * 루프문 for, while - 프로그램 내에서 반복적인 행위에 대해서 처리해 주는 명령문
 * *
 */



