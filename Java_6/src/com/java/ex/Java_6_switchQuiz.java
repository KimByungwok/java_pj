package com.java.ex;

import java.util.Scanner;

public class Java_6_switchQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i = sc.nextInt();
		if ((i > 100) || (i <= 0)) {
			System.out.println("잘못 입력");
		} else {
			switch (i / 10) {
			case 10:
			case 9:
				System.out.println("성적은 A");
				break;
			case 8:
				System.out.println("성적은 B");
				break;
			case 7:
				System.out.println("성적은 C");
				break;
			case 6:
				System.out.println("성적은 D");
				break;
			default :
				System.out.println("넌 F 다");
			}
		}
		sc.close();
	}
}