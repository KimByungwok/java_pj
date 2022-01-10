package com.java.ex;

public class StringSkil {

	public static void main(String[] args) {
		String st1 = "   i am namil park.";
		String st2 = "I AM A KING OF THE WORLD";
		
		System.out.println(st1.concat(st2)); // 문자열 연결
		System.out.println(st1.substring(7)); // 문자열 자르기
		System.out.println(st1.length()); // 문자열 길이
		System.out.println(st1.toUpperCase()); // 대문자로 만들기
		System.out.println(st1.toLowerCase()); // 소문자로 만들기
		System.out.println(st1.charAt(3)); // 특정 위치의 글자 찾기
		System.out.println(st1.indexOf('r')); // 특정 문자열의 위치
		
		String st3 = " i am suji bae";
		
		System.out.println(st1.equals(st3)); // 믄지열 비교
		System.out.println(st1.trim()); // 문자열 앞 공백 제거
		System.out.println(st1.replace('.', '!')); // 특정 문자 변경
		System.out.println(st1.replaceAll("i am", "you are")); // 특정 문자열 변경
		System.out.println(st1);
		
		StringBuilder stb = new StringBuilder("I AM A KING OF THE WORLD!");
		
		stb.append("really"); // 문자열의 추가
		System.out.println(stb);
		
		stb.insert(2, "Namil park, "); //특정 위치에 믄자열 추가
		System.out.println(stb);
		
		stb.delete(9, 14); // 문자열 삭제
		System.out.println(stb);
		
		stb.deleteCharAt(14); // 특정 문자 하나 삭제
		System.out.println(stb);
		
		
	}

}
