package day2;

import java.util.ArrayList;
import java.util.List;

//  


public class Demo3 {

	public static void main(String[] args) {
//		ArrayList<Integer> ary = new ArrayList<Integer>();
		List<Integer> ary = new ArrayList<Integer>(); 
		
		A a = new A();
		ABC abc = new ImplABC();
		
		// 다형성
		a.display(abc);
		
		
		ImplABC temp =  new ImplABC();
		a.displayCoupling(temp);

	}

}
