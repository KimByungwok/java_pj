package com.java.ex;

public class TryCatch {
	private int num1;
	private int num2;

	public TryCatch(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

		try {
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			num2 = 2;
		} finally {
			System.out.print("num2가 0이라 2로 바꾼 결과: ");
			System.out.println(num1 / num2);
		}

	}

	// getters & setters
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// 사칙 연산
	public void result() {
		try {
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("num2에 0이라 1로 바꿈");
			num2 = 1;
		} finally {
			System.out.print("나눗셈 결과: ");
			System.out.println(num1 / num2);
		}

	}
}
