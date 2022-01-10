package Java.com.ex;		//정보 출력

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3308/test";
	static String uid = "root";
	static String pwd = "281471";
	static String query = "select * from member";
	
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
				String id = rs.getString("m_id");
				String pw = rs.getString("m_pw");
				String name = rs.getString("m_name");
				String email = rs.getString("m_email");
				
				System.out.println("ID : "+id);
				System.out.println("PW : "+pw);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
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
