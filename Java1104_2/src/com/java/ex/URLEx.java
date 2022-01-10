package com.java.ex;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.Scanner;

public class URLEx {
	public URLEx() {
		String code =null;
		System.out.println("주소 입력: ");
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("D:\\KIMBANG\\PROGRAMING\\jee-2021-06\\eclipse\\eclipse-workspace\\Java1104_2\\src\\File.html",false);
			
			while((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("끝!");
			
			fw.close();
			webData.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
