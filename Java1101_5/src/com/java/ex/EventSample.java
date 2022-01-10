package com.java.ex;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*이벤트 
 * -사용자 입력, 키보드, 마우스 등의 장치로부터 발생하는 모든 사건
 * 이벤트 지향(event-driven)프로그램
 * - 프로그램은 무한 루프를 돌면서 사용자의 이벤트가 발생하기를 기다림
 * - 사용자 이벤트 발생 > 해당 이벤트 처리 > 무한 루프(대기) */
public class EventSample extends JFrame{
	JLabel j1;
	JButton jb1, jb2, jb3;
	public EventSample() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		jb1 = new JButton("눌러봐라");
		jb2 = new JButton("아이언맨");
		jb3 = new JButton("스파이더맨");
		j1 = new JLabel("Click Button");
		
		jb1.addActionListener(new EventClickButton(j1));
		jb2.addActionListener(new EventIronManButton(j1));
		jb3.addActionListener(new EventSpidermanButton(j1));
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(j1);
		
		setTitle("Event Sample");
		setSize(400,300);
		setVisible(true);
	}
	
}
