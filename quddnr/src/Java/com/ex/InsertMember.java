package Java.com.ex;		//상품 추가

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMember {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3306/test";
	static String uid = "root";
	static String pwd = "281471";
	public static void main(String[] args) {
		Date now = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat();
		String formatedNow = formatter.format(now);
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		String query1 = "select * from quddnr";
		String query2 = "insert into quddnr values(?,?,?,?,?)";
		
		System.out.println("<<추가할 상품의 정보 입력>>");
		System.out.print("상품 코드(A001): ");
		String Code = sc.next();
		System.out.print("상품명: ");
		String Name = sc.next();
		System.out.print("상품 규격(일반,특별): ");
		String Division = sc.next();
		System.out.print("상품 가격: ");
		String Price = sc.next();
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pwd);
			stmt = con.createStatement();
			
			pstmt = con.prepareStatement(query2);
			pstmt.setString(1, Code);
			pstmt.setString(2, Name);
			pstmt.setString(3, Division);
			pstmt.setString(4, Price);
			pstmt.setString(5, formatedNow);
			
			int resultQuery = pstmt.executeUpdate();
			if (1 != resultQuery) System.out.println("상품 등록 실패다");
			else {
				System.out.println("상품 등록 성공! 정보 출력");
				System.out.println("----------------------------");
			}
			
			rs = stmt.executeQuery(query1);
			
			while(rs.next()) {
				String _Code = rs.getString("Code");
				String _Name = rs.getString("Name");
				String _Division = rs.getString("Division");
				String _Price = rs.getString("Price");
				String _formatedNow = rs.getString("formatedNow");
				
				System.out.println("상품 코드: "+ _Code);
				System.out.println("상품명: "+ _Name);
				System.out.println("상품 규격: "+ _Division);
				System.out.println("상품 가격: "+ _Price);
				System.out.println("입력 시간 : "+_formatedNow);
				System.out.println("================================");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
				if(pstmt != null)pstmt.close();
				if(sc != null) sc.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
	}
}
