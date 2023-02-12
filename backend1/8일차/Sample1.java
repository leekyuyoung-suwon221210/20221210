package java_8day;

enum CALCTYPE{ADD,MINUS,MULTI,DIVIDE}
public class Sample1 {
	public static void getResult(CALCTYPE type, Object[] result, int...a      ){
		long temp = a[0];
		switch (type) {
		case ADD:			
			for (int i = 1; i < a.length; i++) {
				temp+=a[i]; 
			}
			break;
		case MINUS:	
			for (int i = 1; i < a.length; i++) {
				temp-=a[i]; 
			}			
			break;
		case MULTI:		
			for (int i = 1; i < a.length; i++) {
				if(a[i] != 0)
					temp*=a[i]; 
			}
			break;			
		case DIVIDE:
			double dtemp = a[0];			
			for (int i = 1; i < a.length; i++) {
				if(a[i]!= 0) {
					dtemp/=a[i];
					}  
			}			
			result[0] = dtemp;			
			return;
		default:
			break;
		}
		
		result[0] = temp;
	}
	
	public static void main(String[] args) {
		Object[] result = {0};
		getResult(CALCTYPE.DIVIDE, result, 10,50,20,10,20,40,50);
		System.out.println(result[0]);
		
	}

}
