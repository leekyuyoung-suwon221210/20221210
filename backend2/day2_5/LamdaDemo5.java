package day2_5;

interface UseThis{
	void use();
}

public class LamdaDemo5 {
	public void lambda() {
		String hi = "hi";
		UseThis u1 = new UseThis() {			
			@Override
			public void use() {
				System.out.println(this);				
			}
		};
		u1.use();
		
		UseThis u2 = ()->System.out.println(this);
		u2.use();
	}

	public static void main(String[] args) {
		LamdaDemo5 demo =  new LamdaDemo5();
		demo.lambda();		
		System.out.println(demo);

	}

}
