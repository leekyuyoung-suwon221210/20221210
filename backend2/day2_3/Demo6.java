package day2_3;

public class Demo6 {

	public static void tic() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {		
		try {
			tic();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
