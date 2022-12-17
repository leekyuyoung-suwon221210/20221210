package statement;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력이 가능
		String strA = sc.next();		
		String strB = sc.next();
		
		int QtyA = Integer.parseInt(strA);
		int QtyB = Integer.parseInt(strB);
		int Amt = QtyA*12 + QtyB*10;
		System.out.println(Amt);
		if(QtyA > QtyB) {
			double DiscountAmt =  Amt*0.1;
			double FinalAmt = Amt-DiscountAmt;
			System.out.println(FinalAmt + " " + FinalAmt);
		}
	}

}
