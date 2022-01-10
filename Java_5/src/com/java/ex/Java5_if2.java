package com.java.ex;

public class Java5_if2 {

	public static void main(String[] args) {
		int i =20;
		int j =20;
		int h = 30;
		
		if (i>j) {
			System.out.println("i가 j보다" +(i-j)+"만큼 크다");
		}
		else {
			System.out.println("j가 i보다" +(j-i)+"만큼 크다");
		}
		
		if((i+j)==h) {
			System.out.println("i와j의 합은 h와 같습니다");
		}
		else {
			System.out.println("i와j의 합은 h와 다릅니다");
		}
	}
}
