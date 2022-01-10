package com.java.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("List에 저장된 문자열 0");
		arList.add("List에 저장된 문자열 1");
		arList.add("List에 저장된 문자열 2");
		System.out.println(arList.toString());
		
		Iterator<String> itr1 = arList.iterator();
		while(itr1.hasNext()) {
		System.out.println(itr1.next());
		}
	HashMap<Integer,String> hMap = new HashMap<Integer,String>();
	hMap.put(0, "Map에 저장된 문자열0");
	hMap.put(1, "Map에 저장된 문자열1");
	hMap.put(2, "Map에 저장된 문자열2");
	hMap.put(3, "Map에 저장된 문자열3");
	hMap.put(4, "Map에 저장된 문자열4");
	
	System.out.println(hMap.toString());
	
		Set<Integer> set = hMap.keySet();
		Iterator<Integer> itr2 = set.iterator();
		
		while (itr2.hasNext()) {
			Integer key = itr2.next();
			System.out.println(key+" : "+hMap.get(key));
		}
	}
}
