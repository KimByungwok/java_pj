package com.java.ex;

import java.util.Scanner;

public class Java_7arrayQuiz2 {

	public static void main(String[] args) {
		String[] arrName = { "남일", "보겸", "시영", "수지", "고은" };
		int[] iArr = new int[5];
		int totalHegiht = 0;
		int maxHeight = 0;
		int maxHeightIndex = 0;
		int minHeight = 0;
		int minHeightIndex = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(arrName[i] + "친구의 키를 입력하세요(cm)");
			iArr[i] = scanner.nextInt();
			totalHegiht = totalHegiht + iArr[i];
			if (iArr[i] > maxHeight) {
				maxHeight = iArr[i];
				maxHeightIndex = i;
			}						
		}
		System.out.println("친구들의 평균 신장은 " + (totalHegiht / arrName.length) + " Cm입니다.");
		System.out.println("최장신은 "+arrName[maxHeightIndex]+" 친구고 키는 "+maxHeight+" cm");
		
		minHeight = maxHeight;
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] < minHeight) {
				minHeight = iArr[i];
				minHeightIndex = i;
			}
		}
		System.out.println("최단신은 "+arrName[minHeightIndex]+" 친구고 키는 "+minHeight+" cm");
		
		scanner.close();
	}
}
