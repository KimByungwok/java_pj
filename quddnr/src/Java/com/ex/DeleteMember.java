package Java.com.ex; //회원 삭제

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMember {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3306/test";
	static String uid = "root";
	static String pwd = "281471";

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("삭제할 회원 이름 입력: ");
		String delName = sc.next();

		String query1 = "select * from quddnr";
		String query2 = "delete from quddnr where Code='" + delName + "'";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, uid, pwd);
			stmt = con.createStatement();

			int resultQuery = stmt.executeUpdate(query2);
			if (1 != resultQuery) {
				System.out.println("상품 삭제 실패!");
				System.out.println("상품 정보를 출력합니다");
				System.out.println("--------------------------");
			} else
				System.out.println("상품 삭제 성공!!");

			rs = stmt.executeQuery(query1);

			while (rs.next()) {
				String Code = rs.getString("Code");
				String Name = rs.getString("Name");
				String Division = rs.getString("Division");
				String Price = rs.getString("Price");

				// 상품 정보 출력

				System.out.println("상품 코드: " + Code);
				System.out.println("상품명: " + Name);
				System.out.println("상품 규격: " + Division);
				System.out.println("상품 가격: " + Price);
				System.out.println("================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
			sc.close();

		}
	}

}
