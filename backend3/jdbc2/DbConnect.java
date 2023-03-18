package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect implements AutoCloseable{
	// 드라이버 로드
	// 데이터 베이스 접속해서 접속객체 반환
	private static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
	private static final String ID = "javadb";
	private static final String PASSWORD = "javadb";
	private static Connection conn;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(URL,ID,PASSWORD);
			return conn;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public void close() throws Exception {
		conn.close();
		
	}
	
}
