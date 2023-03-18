package jdbc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// db 연결후  추가
		// db 연결후  조회
		// db 연결후  삭제
		// db 연결후  업데이트
		
		// 조회기능
		
		String sql = "select * from student";
		try(
				DbConnect dbco = new DbConnect();				
				Statement stmt =  dbco.getStatement();
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
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
