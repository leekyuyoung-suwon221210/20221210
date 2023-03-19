package DBProject;

public class DeleteDemo {

	public static void main(String[] args) {
		DbManager dbm = new DbManager();
		
		System.out.println("before delete.................");
		dbm.selectData().forEach(x->System.out.println(x));
		
		dbm.deleteData("4");
		
		System.out.println("after delete.................");
		dbm.selectData().forEach(x->System.out.println(x));

	}

}
