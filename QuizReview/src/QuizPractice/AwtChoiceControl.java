package QuizPractice;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtChoiceControl {
		private Frame mainFrame;
		private Label headerLabel;
		private Label statusLabel;
		private Panel controlPanel;
		private Choice choice;
		private TextField textField;
		private Button btnAdd;
		private Panel panel;
		private Panel panelFun;
		private Button btnDelete;

		public AwtChoiceControl() {
			prepareGUI();
		}

		public static void main(String[] args) {
			AwtChoiceControl awtControlDemo = new AwtChoiceControl();
			awtControlDemo.showTextField();
		}

		private void prepareGUI() {
			// Frame 에 대한 셋팅
			mainFrame = new Frame("Java AWT 샘플");
			mainFrame.setSize(400, 400);
			mainFrame.setLayout(new GridLayout(3, 1));
			mainFrame.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent windowEvent) {
					System.exit(0);
				}
			});

			// 상단에 있는 라벨
			headerLabel = new Label();
			headerLabel.setAlignment(Label.CENTER);
			headerLabel.setText("Control Test : Choice Control");

			// 하단 상태값 라벨
			statusLabel = new Label();
			statusLabel.setText("Status Lable");
			statusLabel.setAlignment(Label.CENTER);
			statusLabel.setSize(350, 100);

			controlPanel = new Panel();
			
			mainFrame.add(headerLabel);
			mainFrame.add(controlPanel);
			mainFrame.add(statusLabel);
			mainFrame.setVisible(true);
		}

		private void showTextField() {
			controlPanel.setLayout(new GridLayout(2, 1, 0, 0));
			
			panel = new Panel();
			controlPanel.add(panel);
			
			choice = new Choice();
			panel.add(choice);
			
			// 리스트에 값을 추가함 
			choice.add("Apple");
			choice.add("Grapes");
			choice.add("Mango");
			choice.add("Peer");
			
			Button showButton = new Button("보기");
			panel.add(showButton);
			
			btnDelete = new Button("값삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					choice.remove(choice.getSelectedIndex());
				}
			});
			panel.add(btnDelete);
			
			// 상태정보창에 값 보여주기 
			showButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String data = "선택한 값보기 : " 
				            + choice.getItem(choice.getSelectedIndex());
				            statusLabel.setText(data);

				}
			});
			
			// Choice 에 값 추가하기 
			btnAdd = new Button("값추가");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					choice.add(textField.getText());
					// 추가한 값이 제일위에 보이게 합니다. 
					choice.select(choice.getItemCount() - 1);
				}
			});
			
			panelFun = new Panel();
			controlPanel.add(panelFun);
			
			textField = new TextField();
			textField.setColumns(10);
			panelFun.add(textField);
			
			panelFun.add(btnAdd);
			mainFrame.setVisible(true);
		}
}
