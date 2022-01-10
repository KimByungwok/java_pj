package Java.com.ex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택(1.상품 추가, 2.상품 검색,3.상품 수정, 4.상품 삭제) : ");
		int menu = sc.nextInt();
		
		if (menu == 1) {
			InsertMember Insm = new InsertMember();
		}else if (menu == 2) {
			Information IF = new Information();
		}else if (menu == 3) {
			ChangeMember CM = new ChangeMember();
		}else if (menu == 4) {
			DeleteMember DM = new DeleteMember();
		}else {
			System.out.println("잘못 입력함");
		}
	}
}
