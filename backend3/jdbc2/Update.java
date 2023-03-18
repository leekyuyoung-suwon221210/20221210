package jdbc2;

import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		// 데이터 베이스 접속
		// 업데이트 구문
		// 실행
		String sql = " update student";
		sql += " set name = ?, age = ? ";
		sql += " where id = 2";
		
		try(
				DbConnect dbc = new DbConnect();
				PreparedStatement pstmt = dbc.getprepare(sql);
				) 
		{
			pstmt.setString(1, "대한민국");
			pstmt.setInt(2, 5000);
			pstmt.executeUpdate();
						
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
