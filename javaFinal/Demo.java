package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	private static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
	private static final String ID = "javadb";
	private static final String PASSWORD = "javadb";
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	public static void main(String[] args) {
		try {
			// 1 DB 접속
			//	 - driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			//   - DB 접속정보를 가지고 실제 접속(DB서버경로, 아이디,패스워드)
			conn= DriverManager.getConnection(URL,ID,PASSWORD);
			conn.setAutoCommit(false); // 자동커밋방지
			
			// 2. 쿼리 생성
			String sql = "insert into product(id,name,price) values(?,?,?)";		
			// 쿼리문자의 실행을 위한 preparestatement 객체  생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 쿼리문에 동적으로 ? 자리에 들어갈 데이터 셋팅
			pstmt.setString(1, "005");pstmt.setString(2, "NoteBook");pstmt.setString(3, "1,350,000");
			
			// 3. 실행 - insert 
			pstmt.executeUpdate();  // INSERT, UPDATE or DELETE;
			
			// 4. 실행 - update
			// 	- 위에정의한 2과정과 3번 과정을 실행한다
			sql = "update product set price= ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "998,000");pstmt.setString(2, "001");
			pstmt.executeUpdate();		
			conn.commit();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
