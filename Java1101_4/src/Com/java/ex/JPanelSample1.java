package Com.java.ex;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JPanelSample1 extends JFrame{
	public JPanelSample1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(new JRadioButton("Java"));
		ct.add(new JRadioButton("Jsp"));
		ct.add(new JRadioButton("Spring"));
		ct.add(new JButton("Java"));
		ct.add(new JButton("Jsp"));
		ct.add(new JButton("Spring"));
		setTitle("JPanel Sample1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
