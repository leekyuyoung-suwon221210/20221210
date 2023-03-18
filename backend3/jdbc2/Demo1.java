package jdbc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		// db 연결후  추가
		// db 연결후  조회
		// db 연결후  삭제
		// db 연결후  업데이트
		
		// 조회기능
		
		String sql = "select * from student";
		try(
				Connection conn = DbConnect.getConnection();
				Statement stmt =  conn.createStatement();
				ResultSet rs =  stmt.executeQuery(sql);	
				) 
		{
			
			while (rs.next()) {
				System.out.println(
				rs.getInt("id")+" "+rs.getString("name") 
				+ " " + rs.getInt("age")+ " " + rs.getInt("gender")
				+ " " + rs.getInt("grade")+ " " + rs.getInt("type")
				);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
