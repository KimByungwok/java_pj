package com.java.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventClickButton implements ActionListener{
	JLabel j1;
	public EventClickButton(JLabel j1) {
		this.j1 = j1;
	}
	public void actionPerformed(ActionEvent e) {
		j1.setText("눌러보란다고 진짜 누르노ㅋㅋ");
	}
}
