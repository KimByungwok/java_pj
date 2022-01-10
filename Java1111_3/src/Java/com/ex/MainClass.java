package Java.com.ex;		// 정보 수정

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainClass {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3308/test";
	static String uid = "root";
	static String pwd = "281471";
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement searchpstmt = null;
		PreparedStatement updatepstmt = null;
		ResultSet rs = null;
		String id,pw,name,email;
		Scanner sc = new Scanner(System.in);
		
		String query1 = "select * from member where m_id=?";   
		String query2 = "update member set m_pw=?,m_name=?,m_email=? where m_id=?";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pwd);  //db소환
			con.setAutoCommit(false);//트랜잭션 처리 수동 전환
			
			System.out.println("정보 수정이 필요한 회원 ID: ");
			id = sc.next();
			
			searchpstmt = con.prepareStatement(query1); 
			searchpstmt.setString(1, id); //query1에 id ? 값 지정
			rs = searchpstmt.executeQuery();  // select 결과값 생성
			
			if(rs.next()==true) {
				id = rs.getString("m_id");
				pw = rs.getString("m_pw");
				name = rs.getString("m_name");
				email = rs.getString("m_email");
				
				System.out.println("====================");
				System.out.println("<<정보 변경이 필요한 회원>>");
				System.out.println("ID : "+id);
				System.out.println("PW : "+pw);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
				System.out.println("===================="); //값이 있으면 소환한 id 의 내용물 출력
			}else {
				System.out.println(id + "님은 존재하지 않습니다"); // 없으면 없다고 하기
				System.exit(0);
			}
			
			System.out.println("");			//수정할 정보의 값들 삽입
			System.out.println("<<정보 변경 입력>>");
			System.out.println("PW: ");
			pw = sc.next();
			System.out.println("이름: ");
			name = sc.next();
			System.out.println("이메일: ");
			email = sc.next();
			
			updatepstmt = con.prepareStatement(query2);  // query2에 pw,name,email 값을 변경
			updatepstmt.setString(1, pw);
			updatepstmt.setString(2, name);
			updatepstmt.setString(3, email);
			updatepstmt.setString(4, id);
			int resultQuery = updatepstmt.executeUpdate();  //변경된 값 실행되니까 1 삽입
			
			if (1==resultQuery){
				rs.close();
				searchpstmt.close();
				
				searchpstmt = con.prepareStatement(query1);  // 다시 ?에 값을 바꿀 id의 값을 삽입
				searchpstmt.setString(1, id);
				rs = searchpstmt.executeQuery();
				
				if(rs.next() == true) {  
					id = rs.getString("m_id");
					pw = rs.getString("m_pw");
					name = rs.getString("m_name");
					email = rs.getString("m_email");
					
					System.out.println("====================");	//위에와 같은 id값을 가진 회원의 정보 출력
					System.out.println("<<정보 변경한 회원>>");
					System.out.println("ID : "+id);
					System.out.println("PW : "+pw);
					System.out.println("이름 : "+name);
					System.out.println("이메일 : "+email);
					System.out.println("====================");
				}
				
				while(true) {
					System.out.println("변경을 확정하시겠습니까? Y/N");
					String choice = sc.next(); //확정값 받기
					
					if(choice.equals("y")||choice.equals("y")) {
						con.commit(); // 맞으면 commit으로 저장
						System.out.println("정보 변경 성공");
						break;
					}else if (choice.equals("n")||choice.equals("N")) {
						con.rollback(); // 안 바꾸면 지금까지는 없던 일로 만들기 위해 롤백
						System.out.println("정보 변경 취소");
						break;
					}else {
						System.out.println("잘못된 입력입니다. 다시 한번 확인해라");
						continue;
					}
				}
			}	
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try { // 사용 했으면 다 닫기
				if(rs != null) rs.close();
				if(searchpstmt != null) searchpstmt.close();
				if(updatepstmt != null) updatepstmt.close();
				if(con != null) con.close();
				if(sc != null)sc.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
