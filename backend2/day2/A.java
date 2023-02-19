package day2;

public class A implements MyInterFace{
	
	public void display(ABC abc) {
//		(new C()).show();
		abc.show();
	}
	
	
	public void displayCoupling(ImplABC x) {
		x.show();
	}
}
