package com.java.ex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String song = "아 집에 가고 싶다\r\n"
					+ "진짜 가고 싶다 너무 어렵다\r\n"
					+ "하나도 모르는데 중간고사 어떡하지";
					// \r\n window에서 한줄 내림이 잘 안될때 사용(타자기 시절 반영)
		char[] input = new char[song.length()];
		song.getChars(0, song.length(), input, 0); // 문자열을 문자 배열로 설정
		System.out.println("파일명 입력(.txt는 생략) :");
		String fileName = sc.next() + ".txt";
		FileWriter fw = new FileWriter(fileName);
		fw.write(song);
		fw.close();
		System.out.println(fileName+"파일이 생성되었습니다.");
		
		System.out.println("읽어 들일 파일명 입력(.txt는 생략): ");
		String inputFileName = sc.next() + ".txt";
		FileReader fr = new FileReader(inputFileName);
		int ch;
		while((ch=fr.read())!= -1) { // 파일에서 한 문자씩 읽어들임
			System.out.print((char)ch);	// 읽은 문자 출력
		}
		fr.close();	
	}
}
