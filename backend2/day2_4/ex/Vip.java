package day2_4.generic.ex;

public class Vip implements Grade{	 
	@Override
	public double reward(int price) {		
		return price*VIP_RATE;
	}

	@Override
	public String toString() {
		return "Vip";
	}

}
