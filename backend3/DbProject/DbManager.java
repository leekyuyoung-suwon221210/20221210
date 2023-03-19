package DBProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

enum STUDENTCOLS{
	NAME{
		@Override
		public String toString() {			
			return super.toString().toLowerCase();
		}			
	},
	
	AGE{
		@Override
		public String toString() {			
			return super.toString().toLowerCase();
		}
	},
	GENDER{
		@Override
		public String toString() {			
			return super.toString().toLowerCase();
		}
	},
	GRADE{
		@Override
		public String toString() {			
			return super.toString().toLowerCase();
		}
	},
	TYPE{
		@Override
		public String toString() {			
			return "type";
		}
	},

				
}

public class DbManager implements DBHandler, AutoCloseable {
	private final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
	private final String ID = "javadb";
	private final String PASSWORD = "javadb";
	private Connection conn;
	
	
	
	public DbManager() {
		super();
		connectDB();
	}

	@Override
	public Connection connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn= DriverManager.getConnection(URL,ID,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean insertData(Map<String, Object> datas) {
		String sql = "insert into student(name,age,gender,grade,type) values(?,?,?,?,?)";		
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql); 
				) 
		{			
			pstmt.setString(1, (String)datas.get(STUDENTCOLS.NAME.toString()));
			pstmt.setInt(2, (int) datas.get(STUDENTCOLS.AGE.toString()));
			pstmt.setInt(3, (int) datas.get(STUDENTCOLS.GENDER.toString()));
			pstmt.setInt(4, (int) datas.get(STUDENTCOLS.GRADE.toString()));
			pstmt.setInt(5, (int) datas.get(STUDENTCOLS.TYPE.toString()));
			if(pstmt.executeUpdate() == 1)
				return true;			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateData(String id, Map<String, Object> datas) {
		String sql = "update student set ";
		
		for (Entry<String, Object> entry : datas.entrySet()) {
			if(entry.getValue() instanceof String)
				sql += entry.getKey()+" = '" + entry.getValue() + "' ,";
			else
				sql += entry.getKey()+" = " + entry.getValue() + " ,";
		} 
		// update student set name = 동해 ,age = 20 ,
		sql = sql.substring(0, sql.length()-1);
		sql += " where id = "+id;
		
		try(
				PreparedStatement pstmt =  conn.prepareStatement(sql);
				) 
		{
			if(pstmt.executeUpdate() == 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Map<String, Object>> selectData() {
		List<Map<String, Object>> result = new ArrayList<Map<String,Object>>();
		// db select 결과물을 가지고  ResultSet 객체에 담긴걸... 
		// result에 put해서 리턴
		String sql = "select * from student";
		try(
				PreparedStatement pstmt =  conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				) 
		{
			while (rs.next()) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("name", rs.getString("name"));
				m.put("id", rs.getInt("id") );
				m.put("age",rs.getInt("age"));
				m.put("gender", rs.getInt("gender"));
				m.put("grade", rs.getInt("grade"));
				m.put("type", rs.getInt("type"));
				result.add(m);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public boolean deleteData(String id) {
		String sql = "delete from student where id = "+id;
		try
		(
			PreparedStatement pstmt = conn.prepareStatement(sql);
		)
		{
			if(pstmt.executeUpdate() == 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void close() throws Exception {
		conn.close();
		
	}

}
