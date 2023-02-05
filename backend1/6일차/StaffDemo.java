package java_6day;

public class StaffDemo {

	public static void main(String[] args) {
		Staff st = new Staff();
		
		st.setName("mark").setAge(20).sayHello();		
		st.setName("kim").setAge(15).sayHello();
		st.setAge(20).setName("hong");

	}

}
