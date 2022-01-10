package com.java.ex;

public class Java_7_whileQuiz {

	public static void main(String[] args) {
		// 1부터 100까지 수 중에서 3의 배수만 합한 값을 구해보자
		int i = 0;
		int sum = 0;

		while (i <= 100) {
			i++;
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
