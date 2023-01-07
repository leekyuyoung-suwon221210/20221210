package array;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		String[] uniqueNums = {"20A11","22F37","21G02","22E09","20C29"};
		String[] names =      {"kim"  ,"lee"  ,"park" ,"choi" ,"jung"};	
		/**
		 * Unique Number or 'q' : 21G02
		 * Name : park
		 * 
		 * Unique Number or 'q' : 22A12
		 * Do not exist
		 * 
		 * Unique Number or 'q' : q
		 * End
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Unique Number or \'q\' ");
			String input = sc.next();
			if(input.equals("q"))	break;
			
			String result = "Do not exist";
			
			for (int i = 0; i < uniqueNums.length; i++) 
			{
				if(input.equals(uniqueNums[i])) 
				{
					result = "Name : " + names[i]; 
					break;
				}
			}
			
			System.out.println(result);
			
		}
		
		System.out.println("End");
		

	}

}
