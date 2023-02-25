package day2_3;

class Reso implements AutoCloseable{
	public void show() {
		System.out.println("resource assigne");
	}
	public void close(){
		System.out.println("assigned resource rollback");
	}
}

public class Demo8 {

	public static void main(String[] args) {		
		try(Reso a = new Reso();) {
			a.show();
			System.out.println("logic......");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----------end----------");

	}

}
