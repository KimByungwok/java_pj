package com.java.ex;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		String directory = "C:/Windows";
		File f1 = new File(directory);
		if(f1.isDirectory()) {  //is나 헤즈(?)는 리턴값이 불린 True or Flase
			System.out.println("탐색 디렉토리" + directory);
			System.out.println("----------------------");
			String[] list = f1.list();
			for (int i=0;i<list.length;i++) {
				File f2 = new File(directory + "\"" + list[i]);
				if (f2.isDirectory()) System.out.println(list[i]+"--> is Directory");
				else System.out.println(list[i]+"--> is File");
			}
		} else System.out.println("지정한"+directory+"는 디렉토리가 아닙니다");
		
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		
		File f3 = new File("D:/test.txt");
		System.out.println("파일 이름 : "+f3.getName());
		System.out.println("파일 경로 : "+f3.getPath());
		System.out.println(f3.exists()? "파일 존재" : "파일 없음");
		System.out.println(f3.canWrite()?"수정 가능": "수정 불가");
		System.out.println(f3.canRead()?"읽기 가능":"읽기 불가");
		System.out.println(f3.isDirectory()?"디렉토리": "디렉토리 아님");
		System.out.println(f3.isFile()?"파일":"파일 아님");
		System.out.println(f3.isAbsolute()?"절대경로":"상대경로");
		System.out.println("1970.01.01 기준 밀리초 단위로 최종 수정시간: "+f3.lastModified());
		System.out.println("파일 크기: "+f3.length()+"bytes");
		
	}	
}
