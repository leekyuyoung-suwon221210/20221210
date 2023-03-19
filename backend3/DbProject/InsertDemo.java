package DBProject;

import java.util.HashMap;
import java.util.Map;

public class InsertDemo {

	public static void main(String[] args) {
		// insert test
		DbManager dbm = new DbManager();
		// data
		Map<String, Object> insertMap = new HashMap<String, Object>();
		insertMap.put(STUDENTCOLS.NAME.toString(), "철수");
		insertMap.put(STUDENTCOLS.AGE.toString(), 15);
		insertMap.put(STUDENTCOLS.GENDER.toString(), 1);
		insertMap.put(STUDENTCOLS.GRADE.toString(), 1);
		insertMap.put(STUDENTCOLS.TYPE.toString(), 1);
		if(dbm.insertData(insertMap))
			System.out.println("데이터 삽입 성공");
		else
			System.out.println("데이터 삽입 실패");		

	}

}
