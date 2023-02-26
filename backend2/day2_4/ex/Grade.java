package day2_4.generic.ex;

public interface Grade {
	double TOPCLASS_RATE = 0.2;
	double VIP_RATE = 0.1;
	double GENERAL_RATE = 0.05;
	// 구매금액에 대한 적립
	double reward(int price);
}
