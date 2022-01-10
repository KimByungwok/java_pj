package com.java.ex;

public class StringCopy {
	    public static void main(String[] args) {
	        String first = "첫번쨰 문자열";
	        System.out.println("1번 = " + first);
	        String second = first;
	        System.out.println("스트링 카피 = " + second);
	        first = "2번으로 변경";
	        System.out.println("1번 업뎃후 = " + first);

	        String copyString = new String(first);
	        System.out.println("스트링 카피 결과 = " + copyString);
	    }
	}
