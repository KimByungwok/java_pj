package com.java.ex;

/* 형 변환
 * 1. 묵시적 형 변환 - 말 안 해도 안다
 * 	  작은 그릇의 데이터를 큰 그릇으로 옮기는 것, 데이터 손실 발생 없음
 *     1 + 3.14 =x int + float >> float + float = 1.0 + 3.14
 * 2. 명시적 형 변환 - 말 해줘야 안다
 	  큰 그릇의 데이터를 작은 그릇으로 옮기는 것, 데이터 손실 발생 가능 >> 코드 상에 명시 필요
 *    
 *    사용 방법
 *    (바뀔 데이터 타입) 식 또는 변수 << 형 변환 캐스트 연산자
 * */

public class Java5_TypeConversion {

	public static void main(String[] args) {
		int i = 10;
		double d = i; // 묵시적 형 변환

		double d2 = 3.640;
		int i2 = (int) d2; // 명시적 형 변환

		System.out.println(i);
		System.out.println(d);
		System.out.println(i2);
		System.out.println(d2);
	}
}

