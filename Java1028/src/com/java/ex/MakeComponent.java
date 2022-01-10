package com.java.ex;


import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeComponent extends JFrame implements ActionListener{
	JPanel jpanel;
	JLabel jLabel;
	JLabel jLabelBlank;
	JButton jButton;
	JButton jButtonExit;
	JTextField jTextField;
	JComboBox<String> jComboBox;
	JCheckBox jCheckBox;
	String[] items = {"박남일", "배수지", "박보검"};
	
	public MakeComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jpanel = (JPanel)getContentPane();
		jpanel.setLayout(new FlowLayout());
		jLabel = new JLabel("라벨");
		jButton = new JButton("버튼");
		jTextField = new JTextField(20);
		jComboBox = new JComboBox<String>(items);
		jCheckBox = new JCheckBox("체크 박스");
		jLabelBlank = new JLabel();
		jButtonExit = new JButton("Exit");
		
		jpanel.add(jLabel);
		jpanel.add(jButton);
		jpanel.add(jTextField);
		jpanel.add(jComboBox);
		jpanel.add(jCheckBox);
		jpanel.add(jLabelBlank);
		jpanel.add(jButtonExit);
		
		jLabel.setPreferredSize(new Dimension(50,50));  // 디맨션 (차원) 2차원 사이즈 (가로,세로)
		jButton.setPreferredSize(new Dimension(100,50));
		jTextField.setPreferredSize(new Dimension(300,50));
		jComboBox.setPreferredSize(new Dimension(100,50));
		jCheckBox.setPreferredSize(new Dimension(100,50));
		jLabelBlank.setPreferredSize(new Dimension(200,50));
		jButtonExit.setPreferredSize(new Dimension(100,50));
		
		jButton.addActionListener(this);
		jButtonExit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			jLabelBlank.setText(jTextField.getText());
		}else if (e.getSource()==jButtonExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
}
