package com.java.ex;

import java.util.Scanner;

public class Java_6__5_Quiz {
	// 숫자 입력 2 와 3 배수 인지 아무것도 아닌지 판단
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
		
		if ((num % 2 ==0) && (num % 3 == 0)) {
			System.out.println("입력한 수는 2와 3의 배수");
		}
		else if ((num % 2 ==0) && (num % 3 != 0)){
			System.out.println("입력한 수는 2의 배수");
		}
		else if ((num % 2 !=0) && (num % 3 == 0)){
			System.out.println("입력한 수는 3의 배수");
		}
		else{
			System.out.println("아무 배수도 아님");
		}
		sc.close();
	}
}
