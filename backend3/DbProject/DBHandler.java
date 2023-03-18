package DBProject;

import java.sql.Connection;
import java.util.Map;

public interface DBHandler {
	Connection connectDB();
	boolean insertData(Map<String, Object> datas);
	Map<String, Object> selectData();
	boolean updateData(String id, Map<String, Object> datas);
	boolean deleteData(String id);

}
