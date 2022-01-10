package com.java.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;  // is os 전역변수 처리
		
		try {
			is = new FileInputStream("D:/test1.txt");
			os = new FileOutputStream("D:/test1.copy.txt");
			
			byte[] bs = new byte[5]; //속도 향상을 위해 5byte씩 연결
			
			while(true) {
				int count = is.read(bs); // 파일 읽기 처리
				if(-1 == count) {
					break;
				}
				os.write(bs,0,count); // 파일 쓰기 처리
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {	// 연결 끊기
			if (is != null) {
				try {
					is.close();
				}catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os!=null) {
				try {
					os.close();
				}catch (Exception e3) {
					System.out.println(e3.getMessage());
				}
			}
		}

	}
}
