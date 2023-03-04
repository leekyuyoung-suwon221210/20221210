package day2_5;

import java.util.Objects;
import java.util.function.IntUnaryOperator;

public class OperatorDemo {

	public static void main(String[] args) {
		//     int applyAsInt(int operand);
		IntUnaryOperator io = x -> x+2;
		System.out.println(io.applyAsInt(10));
	    
//	    default IntUnaryOperator andThen(IntUnaryOperator after) {
//	        Objects.requireNonNull(after);
//	        return (int t) -> after.applyAsInt(applyAsInt(t));
//	    }
		IntUnaryOperator after = x -> x*2;		
		IntUnaryOperator io2 = io.andThen( x-> x+100 );
		
		
		System.out.println(io2.applyAsInt(10));
		
		
		
	}

}
