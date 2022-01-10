package com.java.ex; //컨트롤 스페이스 = 자동 완성

import java.util.Scanner; //임포트 시키기

public class Sccaner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//	 인스턴스 변수(객체 변수)
		// 이거는 그냥 외워 (함수쓰고 별칭 = new 함수 (시스템 . in))
		
		System.out.print("너 이름이 뭐니?");
		String name = sc.next(); // 문자 입력 받기
		System.out.print("너 몇살이야?"); 
		int age = sc.nextInt(); // 숫자 입력 받기

		System.out.println(name + " !! 나이가 " + age + " 살이구나!");
		sc.close(); // 다 썼어 이제 닫아
	}
}

	/*오류의 종료
	Syntax = 오타 (; , 등 수정 쉬움)
	Runtime = 실행할 때 발생 , JVM에 의해 발생 (에러 메세지를 잘 읽으면 그래도 찾을 수 있다)
	Logic = 논리적 문제로 발생, 프로그래머에 의해 발견 수정 (수정이 까다로움)*/
	
/* 식별자 = 이름 짓기 (변수,상수, 메소드 등)
 * 식별자의 이름은 문자 숫자 특수문자(_ , $) 로 구성해야한다
 * 또한 식별자의 이름은 숫자로 시작할 수 없다
 * 배열 변수 ex) arr age, 포인터 변수 ex) int* page 등 쉽게 구분 짓게 이름을 작명하자
 * 상수는 다 대문자로 쓰며, 띄어쓰기 때는 언더바 _ 를 사용한다
 * 클래스명은 첫글자와 띄어쓰기 때 대문자
 * */