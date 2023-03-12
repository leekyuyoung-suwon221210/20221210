package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * jdbc 프로그래밍 순서
 * 1. jdbc 드라이버(mysql-connector) 로드 및 데이터 베이스 연결
 * 2. sql문 실행
 * 3. ResultSet 객체 처리
 * 4. 자원객체를 닫는다
 */
public class Demo1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb";
		// 1. jdbc 드라이버(mysql-connector) 로드 및 데이터 베이스 연결
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결중....");			
			conn = DriverManager.getConnection(url, "javadb", "javadb");
			System.out.println("데이터베이스 연결성공....");
			
			String str = "insert into student(name,age,gender,grade,type) values('홍길동',12,0,1,1)";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(str);
			if(result > 0)
				System.out.println("데이터 삽입 성공");
			else
				System.out.println("데이터 삽입 실패");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
