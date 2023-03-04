package day2_5;

interface NewObject<T>{
	T getObject(T o);
}
interface NewArray<T>{
	T[] getArray(int size);
}


public class LamdaDemo4 {

	public static void main(String[] args) {		
		NewObject<String> s;
		NewArray<Integer> i;
		
		s = (String str)->{ return str; };
		s = str->new String(str);
		s = String::new;
		String str = s.getObject("hello");
		
		i = size->new Integer[size];
		i = Integer[]::new;
	}

}
