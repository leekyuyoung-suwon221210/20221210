package day2_4.generic.ex;

public class General implements Grade{

	@Override
	public double reward(int price) {
		// TODO Auto-generated method stub
		return price*GENERAL_RATE;
	}

}
