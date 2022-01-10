package com.java.ex;

import java.awt.BorderLayout;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutSample extends JFrame{
	public BorderLayoutSample() {
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10,10);	// BorderLayout 객체 생성
		ct.setLayout(bl);							// 컨테이너 배치 관리자 설정
		ct.add(new JButton("right"),BorderLayout.EAST); // 버튼 생성
		ct.add(new JButton("left"),BorderLayout.WEST);
		ct.add(new JButton("top"),BorderLayout.NORTH);
		ct.add(new JButton("bottom"),BorderLayout.SOUTH);
		ct.add(new JButton("center"),BorderLayout.CENTER);
		setTitle("BorderLayout Sample");
		setSize(400,300);
		setVisible(true);
	}

}
