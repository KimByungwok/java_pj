package com.java.ex;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutSample extends JFrame{
	public FlowLayoutSample() {
		Container ct = getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,10,15);
		ct.setLayout(fl);
		for(int i=1;i<=15;i++)ct.add(new JButton("버튼"+i));
		setTitle("FlowLayout Sample");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
/*		 배치 관리자
 *컨테이너 - 컴포넌트들을 담는 그릇 역할
 *컨테이너에 컴포넌트를 배치하는 다양한 방법을 배치 관리자 클래스로 제공
 *FlowLayout, BorderLayout, GridLayout 클래스 제공
 *차례대로 나옴 	위 아래 좌 우   격자 형식*/
