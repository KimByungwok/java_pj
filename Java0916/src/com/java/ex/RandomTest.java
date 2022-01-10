package com.java.ex;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		int temp;
		int i =0;
		while(i<6) {
			temp = random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				
				if (temp == lotto[j]) 
					continue;	
			lotto[i] = temp;
			}
			i++;
		}
		System.out.println("로또 당첨 번호: " + Arrays.toString(lotto));
	}
}
