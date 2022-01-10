package com.java.ex;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:/test1.txt");
			while(true) { 						// byte단위로 데이터를 읽어들임
				int i = is.read();
				System.out.println("데이터: "+i);
				if (-1 == i)break;  // 먼저 쓰는 이유는 자랑질, 내가 틀릴까봐 미리 방지^^
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
