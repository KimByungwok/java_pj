package Java.com.ex;		//정보 출력

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Information {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3306/test";
	static String uid = "root";
	static String pwd = "281471";
	static String query = "select * from quddnr";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pwd);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String Code = rs.getString("Code");
				String Name = rs.getString("Name");
				String Division = rs.getString("Division");
				String Price = rs.getString("Price");
				
				
				System.out.println("상품 코드 : "+Code);
				System.out.println("상품명 : "+Name);
				System.out.println("상품 규격 : "+Division);
				System.out.println("상품 가격 : "+Price);
				System.out.println("========================");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();	
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
