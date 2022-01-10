package com.java.ex;

/*
 * 연산자 - 일정한 규칙을 가지고 계산하는 것 +-/* 사칙 연산, And Or Not등 논리 연산 등
 * 
 * 연산자 종류
 * 
 * 산술 연산자 - 일상 생활에서 많이 사용하고 있는 연산자
 * 
 * 자동증감 연산자 - 자동으로 1을 증가시키거나 감소시키는 연산자 (++ , --)
 * 
 * 비교 관계 연산자 - 같다, 틀리다, 이상, 이하 ,초과, 미만 판단을 하는 연산자
 * 
 * (==, !=, <, <=, instanceof(쟤가 얘의 클래스 변수냐?))
 * 
 * 논리 연산자 - 두 명제에 대한 논리곱(and), 논리합(or)
 * 
 * 비트 연산자 - 2개의 항에 대해 비트 단위로 연산
 * 
 * 할당 연산자 - 변수에 값을 대입
 * 
 * 줄여 쓰는 연산자 - 변수에 자신의 값을 사칙연산 후에 다시 변수에 대입
 * 
 * 삼항 연산자 = 세 개의 항을 갖는 연산자, 1 ? 2 : 3 ( 1항 값이 참이면 2항 값을 반환, 1항 값이 거짓이면 3항 값을 반환
 */

public class Java5_AnOperator {

	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		int h = 5;

		System.out.println("===산술 연산자===");
		System.out.println("덧샘: " + (i + j));
		System.out.println("뺄샘: " + (i - j));
		System.out.println("곱샘: " + (i * j));
		System.out.println("나눗샘: " + (i / j));
		System.out.println("나머지: " + (i % j));

		System.out.println("===증감 연산자===");
		i++;
		System.out.println("증가: " + i);
		j--;
		System.out.println("감소: " + j);

		System.out.println("===비교,관계 연산자===");
		System.out.println("i == j: " + (i == j));
		System.out.println("i != j: " + (i != j));
		System.out.println("i > j: " + (i > j));
		System.out.println("i < j: " + (i < j));

		System.out.println("===논리 연산자===");
		System.out.println("&&(AND): " + (i > j && i > h));
		System.out.println("&&(AND): " + (i > j && i < h));
		System.out.println("||(OR): " + (i > j || i > h));
		System.out.println("||(OR): " + (i > j || i < h));

		System.out.println("===할당 연산자===");
		System.out.println("h = " + h);
		h = i;
		System.out.println("h = " + h);

		System.out.println("===줄여 쓰는 연산자===");
		i = i + 100;
		System.out.println("i = " + i);
		i = 11;
		System.out.println("i = " + i);
		i += 100;
		System.out.println("i = " + i);

		System.out.println("===삼항 연산자 ===");
		int result = h != 5 ? 1 : 2;
		System.out.println("삼항 연산에 대한 결과(result): " + result);
	}
}
