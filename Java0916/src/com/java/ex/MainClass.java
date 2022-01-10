package com.java.ex;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		String str1 = "그대여 아무 걱정 하지 말아요 우리 함께 노래 합시다";
		String str2 = "2000/00/00";
		String str3 = "23:59:59";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		StringTokenizer stn1 = new StringTokenizer(str1);
		StringTokenizer stn2 = new StringTokenizer(str2,"/");
		StringTokenizer stn3 = new StringTokenizer(str3,":");
		
		System.out.println("첫번째 문장의 문자열 수: " + stn1.countTokens());
		System.out.println("두번째 문장의 문자열 수: " + stn2.countTokens());
		System.out.println("세번째 문장의 문자열 수: " + stn3.countTokens());
		
		while(stn1.hasMoreTokens()) {
			System.out.println(stn1.nextToken());
		}
		while(stn2.hasMoreTokens()) {
			System.out.println(stn2.nextToken());
		}
		while(stn3.hasMoreTokens()) {
			System.out.println(stn3.nextToken());
		}
	}
}
