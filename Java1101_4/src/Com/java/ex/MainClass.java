package Com.java.ex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.println("input number!");
			input = sc.nextInt();
			if ((input != 1) && (input !=2)) {
				System.out.println("wrong number! retry!!");
				continue;
			}else if (1 == input) new JPanelSample1();
			else new JPanelSample2();
		}
	}
}
