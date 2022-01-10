package com.java.ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNet {
	ServerSocket svSoc = null;
	Socket soc = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public ServerNet() {
		try {
			svSoc = new ServerSocket(5000); //포트번호 : 5000
			
			while(true) {
				soc = svSoc.accept();
				System.out.println("Client에서 통신 요청 접수!");
				
				
				writer = new PrintWriter(soc.getOutputStream(),true);
				reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				
				while ((lineStr = reader.readLine())!=null) {
					writer.write(lineStr);
					System.out.println("입력된 값 : "+lineStr);
				}
				writer.close();
				reader.close();
				soc.close();
			}
		}catch (Exception e) {}		
	}
	public static void main(String[] args) {
		new ServerNet();	
	}
}
	
		
			
		