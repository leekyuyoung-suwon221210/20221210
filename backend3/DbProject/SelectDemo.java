package DBProject;

import java.util.List;
import java.util.Map;

public class SelectDemo {

	public static void main(String[] args) {		
		DbManager dbm = new DbManager();
		List<Map<String, Object>> result = dbm.selectData();		
		result.forEach(x->System.out.println(x));
	}

}
