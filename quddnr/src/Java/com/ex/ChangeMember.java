package Java.com.ex;		// 정보 수정

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ChangeMember {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3306/test";
	static String uid = "root";
	static String pwd = "281471";
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement searchpstmt = null;
		PreparedStatement updatepstmt = null;
		ResultSet rs = null;
		String Code,Name,Division,Price;
		Scanner sc = new Scanner(System.in);
		
		String query1 = "select * from quddnr where Code=?";   
		String query2 = "update quddnr set Name=?,Division=?,Price=? where Code=?";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pwd);  //db소환
			con.setAutoCommit(false);//트랜잭션 처리 수동 전환	
			
			System.out.println("정보 수정이 필요한 상품 코드: ");
			Code = sc.next();
			
			searchpstmt = con.prepareStatement(query1); 
			searchpstmt.setString(1, Code); //query1에 Code ? 값 지정
			rs = searchpstmt.executeQuery();  // select 결과값 생성
			
			if(rs.next()==true) {
				Code = rs.getString("Code");
				Name = rs.getString("Name");
				Division = rs.getString("Division");
				Price = rs.getString("Price");
				
				System.out.println("====================");
				System.out.println("<<정보 변경이 필요한 상품 정보>>");
				System.out.println("상품 코드 : "+Code);
				System.out.println("상품명 : "+Name);
				System.out.println("상품 규격 : "+Division);
				System.out.println("상품 가격 : "+Price);
				System.out.println("===================="); //값이 있으면 소환한 id 의 내용물 출력
			}else {
				System.out.println(Code + "상품은 존재하지 않습니다"); // 없으면 없다고 하기
				System.exit(0);
			}
			
			System.out.println("");			//수정할 정보의 값들 삽입
			System.out.println("<<상품 정보 변경 입력>>");
			System.out.println("상품명: ");
			Name = sc.next();
			System.out.println("상품 규격: ");
			Division = sc.next();
			System.out.println("상품 가격: ");
			Price = sc.next();
			
			updatepstmt = con.prepareStatement(query2);  // query2에 name,division,price 값을 변경
			updatepstmt.setString(1, Name);
			updatepstmt.setString(2, Division);
			updatepstmt.setString(3, Price);
			updatepstmt.setString(4, Code);
			int resultQuery = updatepstmt.executeUpdate();  //변경된 값 실행되니까 1 삽입
			
			if (1==resultQuery){
				rs.close();
				searchpstmt.close();
				
				searchpstmt = con.prepareStatement(query1);  // 다시 ?에 값을 바꿀 id의 값을 삽입
				searchpstmt.setString(1, Code);
				rs = searchpstmt.executeQuery();
				
				if(rs.next() == true) {  
					Code = rs.getString("Code");
				    Name = rs.getString("Name");
					Division = rs.getString("Division");
					Price = rs.getString("Price");
					
					System.out.println("====================");	//위에와 같은 id값을 가진 회원의 정보 출력
					System.out.println("<<정보 변경한 상품>>");
					System.out.println("상품 코드 : "+Code);
					System.out.println("상품명 : "+Name);
					System.out.println("상품 규격 : "+Division);
					System.out.println("상품 가격 : "+Price);
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
