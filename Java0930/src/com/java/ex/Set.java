package com.java.ex;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("문자열0");
		hSet.add("문자열1");
		hSet.add("문자열2");
		hSet.add("문자열3");
		hSet.add("문자열2");
		
		System.out.println(hSet.toString());
		
		hSet.remove("문자열0");
		System.out.println(hSet.toString());
		
		int i = hSet.size();
		System.out.println("사이즈: "+i);
	}
}
