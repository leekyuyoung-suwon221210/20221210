package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect implements AutoCloseable{
	// 드라이버 로드
	// 데이터 베이스 접속해서 접속객체 반환
	private final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
	private final String ID = "javadb";
	private final String PASSWORD = "javadb";
	private Connection conn;	
	
	public DbConnect() {
		super();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn= DriverManager.getConnection(URL,ID,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public Statement getStatement() throws Exception {		
		return conn.createStatement();		
	}
	
	public PreparedStatement getprepare(String sql) throws Exception {
		return conn.prepareStatement(sql);
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("auto close called");
		conn.close();
		
	}
	
}
