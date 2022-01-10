package GUI;

import java.awt.Container;
import java.awt.Dimension;

import java.awt.BorderLayout;

import java.awt.Container;
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
import javax.swing.border.Border;

public class GuiClass extends JFrame implements ActionListener{
	JPanel jpanel;
	JLabel jLabelCode;
	JLabel jLabelName;
	JLabel jLabelBlank;
	JButton jButton;
	JTextField jTextFieldCode;
	JTextField jTextFieldName;
	Container ct = getContentPane();
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER,0,0);
	
	public GuiClass() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jpanel = (JPanel)getContentPane();
		jpanel.setLayout(fl);
		jLabelCode = new JLabel();
		jLabelBlank = new JLabel();
		jTextFieldCode = new JTextField(10);
		jTextFieldName = new JTextField(10);
		jButton = new JButton("저장");
		
		ct.add(new JLabel("상품 코드 "),BorderLayout.WEST);
		ct.add(new JLabel("상품명 "),BorderLayout.WEST);
		
		
		jpanel.add(jTextFieldCode);
		jpanel.add(jTextFieldName);
		jpanel.add(jLabelBlank);
		jpanel.add(jButton);
		
		
		
	
		
		
		jLabelCode.setPreferredSize(new Dimension(100,100)); 
		jTextFieldCode.setPreferredSize(new Dimension(300,50));
		jTextFieldName.setPreferredSize(new Dimension(300,50));
		jButton.setPreferredSize(new Dimension(100,100));
		jLabelBlank.setPreferredSize(new Dimension(200,50));
		
		jButton.addActionListener(this);
	}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jButton) {
				jLabelBlank.setText("저장되었습니다");
		}
		
	}
	

}
