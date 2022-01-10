package com.java.ex;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutSample extends JFrame{
	public GridLayoutSample() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10);
		ct.setLayout(gl);
		for(int i = 1; i<=20; i++) ct.add(new JButton ("버튼"+i));
		setTitle("GridLayout Sample");
		setSize(400,300);
		setVisible(true);
	}
}
