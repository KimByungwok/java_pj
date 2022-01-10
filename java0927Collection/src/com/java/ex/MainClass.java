package com.java.ex;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("문자열1");
		arrList.add("문자열2");
		arrList.add("문자열3");
		arrList.add("문자열4");
		
		System.out.println(arrList.toString());
		
		String index = arrList.get(3);
		System.out.println("index 3의 해당하는 값: "+index);
		
		arrList.set(2, "문자열 바꿔치기");
		System.out.println(arrList.toString());
		
		int size = arrList.size();
		System.out.println("ArrayList 크기: "+ size);
		
		arrList.remove(2);
		System.out.println(arrList.toString());
		
		arrList.clear();
		System.out.println(arrList.toString());
		
		arrList = null;
		System.out.println(arrList);
		System.out.println();
		
		//System.out.println(arrList.size());
	LinkedList<String> InList = new LinkedList<String>();
	
	InList.add("1문자열");
	InList.add("2문자열");
	InList.add("3문자열");
	InList.add("4문자열");
	
	System.out.println(InList.toString());
	
	InList.add("5문자열");
	System.out.println(InList.toString());
	
	InList.add(2,"추가 문자열1");
	System.out.println(InList.toString());
	
	InList.add(2,"추가 문자열2");
	
	System.out.println(InList.toString());
	
	int size1 = InList.size();
	System.out.println("사이즈: "+size1);
	
	InList.remove(2);
	System.out.println(InList.toString());
	
	InList.clear();
	System.out.println(InList.toString());
	
	InList = null;
	System.out.println(InList);
	
	}
}
