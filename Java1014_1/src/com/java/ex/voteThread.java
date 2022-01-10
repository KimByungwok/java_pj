package com.java.ex;

import java.util.Random;

public class voteThread implements Runnable{
	
	int target = 100;
	int sum = 0;
	Random rd = new Random();
	
	@Override
	
	public void run() {
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			sum += rd.nextInt(10);
			sb.delete(0, sb.toString().length());
			
			if(sum >= target) {
				sum =100;
				for(int i=1; i<sum; i++) {
					sb.append('*');
				}
				System.out.println();
			}
		}
	}

}
