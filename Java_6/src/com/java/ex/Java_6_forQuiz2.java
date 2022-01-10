package com.java.ex;

public class Java_6_forQuiz2 {
// 1에서 10 이랑 1에서 10까지 홀수 합 짝수 합 3개
	public static void main(String[] args) {
		int sum = 0;
		int hol = 0;
		int jjak = 0;
		
		for (int i = 1; i<=100; i++) {		
			sum = sum+i;
			if(i % 2 == 0) {
				jjak = jjak+i;
			}
			if(i % 2 != 0) {
				hol = hol+i;			
			}
		}
		System.out.println("총합: " +sum+"\n홀수 합: "+hol+"\n짝수 합: "+jjak);
	}
}
