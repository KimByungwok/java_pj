package com.java.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventIronManButton implements ActionListener{
	JLabel j1;
	public EventIronManButton(JLabel j1) {
		this.j1 = j1;
	}
	public void actionPerformed(ActionEvent e) {
		j1.setText("아이언맨!! 레이저 발사!! 주황 뒈져라");
	}
}
