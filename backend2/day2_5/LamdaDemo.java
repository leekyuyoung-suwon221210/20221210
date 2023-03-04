package day2_5;

interface Negative{
	int neg(int x);
}
class NegativeImp implements Negative{
	@Override
	public int neg(int x) {		
		return -x;
	}	
}

public class LamdaDemo {

	public static void main(String[] args) {
		Negative n = new NegativeImp();
		n = new Negative() {
			
			@Override
			public int neg(int x) {				
				return -x;
			}
		};
//		System.out.println( n.neg(10) );
		
		n = (int x)->{return -x;};
//		System.out.println( n.neg(10) );
		n = (x)->{return -x;};
		n = x->{return -x;};
		
		n = x->(-x);
		n = x-> -x;

	}

}
