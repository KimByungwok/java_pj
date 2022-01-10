package com.java.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventSpidermanButton implements ActionListener{
	JLabel j1;
	public EventSpidermanButton(JLabel j1) {
		this.j1 = j1;
	}
	public void actionPerformed(ActionEvent e) {
		j1.setText("스파이더맨 거미줄 발사!!! 묶였군ㅎ");
	}
}

