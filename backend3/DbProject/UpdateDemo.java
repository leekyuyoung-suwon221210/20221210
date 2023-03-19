package DBProject;

import java.util.HashMap;
import java.util.Map;

public class UpdateDemo {

	public static void main(String[] args) {
		DbManager dbm = new DbManager();
		Map<String, Object> updateMap = new HashMap<String, Object>();
		updateMap.put(STUDENTCOLS.NAME.toString(), "자동차");
		updateMap.put(STUDENTCOLS.TYPE.toString(), 4);
		
		System.out.println( dbm.updateData("3", updateMap)?  "update success":"update false") ;

	}

}
