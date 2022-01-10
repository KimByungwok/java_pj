package Java.com.ex.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3308/test";
	static String uid = "root";
	static String pwd = "281471";
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	private String query = null;
	private String query2 = null;
	
	public MemberDAO() {
		try {
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<MemberDTO> select(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		query = "select * from member";
		query2 = "insert into member values(?,?,?,?)";
		
		try {
			con = DriverManager.getConnection(url,uid,pwd);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
				while(rs.next()) {
					String id = rs.getString("m_id");
					String pw = rs.getString("m_pw");
					String name = rs.getString("m_name");
					String email = rs.getString("m_email");
				
					MemberDTO dto = new MemberDTO(id,pw,name,email);
					dtos.add(dto);
				}
			}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null)rs.close();
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			}catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return dtos;
	}
	public void insert(MemberDTO dto) {
		
	}
	public void update(MemberDTO dto) {
		
	}
	public void delete(String id) {
		
	}
}
