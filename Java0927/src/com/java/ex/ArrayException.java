package com.java.ex;

public class ArrayException {
	/*public int []iArr = new int[3];  
	iArr[0] = 1;
	iArr[1] = 2;
	iArr[2] = 3;
	*/
	public int[] iArr = {1,2,3};
	
	public void printIArr() {
		try {
			System.out.println("--------------");
			System.out.println(iArr[3]);
			System.out.println("&&&&&&&&&&&&&&");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("아 몰라 일단 실행해");
		}
	}
}
