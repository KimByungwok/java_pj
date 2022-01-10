package com.java.ex;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		OutputStream os = null;	//os를 전역변수 처리
		
		try {
			os = new FileOutputStream("D:/test1.txt");
			String str = "배고파 죽겄다 죽겄어";
			byte[] bs = str.getBytes();
			os.write(bs);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {	// 반드시 외부와의 연결 종료
			try {
				if(null != os) os.close();
			}catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}
