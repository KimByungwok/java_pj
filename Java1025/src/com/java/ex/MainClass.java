package com.java.ex;

import java.awt.Button;

public class MainClass {

	public static void main(String[] args) {
		/*GUI - 그래픽 유저 인터페이스
		 * 일반적인 응용 프로그램이나 웹 프로그램에서 사용자가 접속하는 부분
		 * CUI - 캐릭터(커멘드 라인)유저 인터페이스
		 * AWT - 앱스트랙트 윈도우 툴킷 - 자바에서 초기에 GUI를 제공하기 위해 존재
		 * Frame - 응용 프로그램에서 GUI 를 구축하기 ㅜ이해 Frame 클래스 이용
		 * Frame 클래스 - Component > Container > Window > Frame > JFrame 형태로 구성
		 * 													//AWT  //Swing
		 * */
		MakeButton btn = new MakeButton();
		btn.pack(); // 기본 사이즈
		//btn.setSize(200,200);
		btn.setVisible(true); // 화면에 그리기
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		btn.setVisible(false);
		btn.dispose();	// 버튼 자원 해제
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.exit(0); //어플 종료
	}
}
