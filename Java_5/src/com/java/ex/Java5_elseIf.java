package com.java.ex;

public class Java5_elseIf {

	public static void main(String[] args) {
		int LunchPrice = 5000;
		
		if (LunchPrice >= 9000) {
			System.out.println("점심 개비싸게 먹었다");
		}
		else if (LunchPrice >= 7000) {
			System.out.println("점심 좀 비싸게 먹었네");
		}
		else if (LunchPrice >= 5000) {
			System.out.println("점심 적당히 먹었다");
		}
		else{
			System.out.println("점심 거저 먹었다");
		}
	}

}
