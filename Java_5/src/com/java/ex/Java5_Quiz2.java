package com.java.ex;

import java.util.Scanner;

// 3개의 점수를 입력 받아 평균을 내고 각 점수가 평균 이상인지 이하인지 확인하라
public class Java5_Quiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국 영 수 순서대로 성적 입력:");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		float avg = (kor + math + eng) / 3;

		if (kor > avg) {
			System.out.println("국어 성적" + kor + "점으로 평균(" + avg + "점) 보다 높음");
		} else {
			System.out.println("국어 성적" + kor + "점으로 평균(" + avg + "점) 보다 낮음");
		}
		if (math > avg) {
			System.out.println("수학 성적" + math + "점으로 평균(" + avg + "점) 보다 높음");
		} else {
			System.out.println("수학 성적" + math + "점으로 평균(" + avg + "점) 보다 낮음");
		}
		if (eng > avg) {
			System.out.println("영어 성적" + eng + "점으로 평균(" + avg + "점) 보다 높음");
		} else {
			System.out.println("영어 성적" + eng + "점으로 평균(" + avg + "점) 보다 낮음");
		}
		sc.close();
	}
}


/*  */