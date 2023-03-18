package jdbc2;

import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		String str = " insert into student(name,age,gender,grade,type)";
		str += " values(?,?,?,?,?)";
		try(
				DbConnect dbcon = new DbConnect();
				PreparedStatement pstmt = dbcon.getprepare(str);
				) 
		{
			pstmt.setString(1, "김밥");
			pstmt.setInt(2, 20);
			pstmt.setInt(3, 0);
			pstmt.setInt(4, 2);
			pstmt.setInt(5, 2);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
