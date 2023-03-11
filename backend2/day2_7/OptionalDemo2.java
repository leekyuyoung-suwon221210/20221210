package day2_7;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo2 {

	
	public static void main(String[] args) {
		String s1 = null;
		Optional<String> o = Optional.ofNullable(s1);
		if(s1 != null) {
			Util.print(s1);
		}
		else {
			Util.print("null");
		}
		
		if(o.isPresent()) {
			Util.print(o.get());
		}else {
			Util.print("null");
		}
		
	}

}
