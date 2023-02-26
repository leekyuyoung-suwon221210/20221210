package day2_4.generic.ex;

public class TopClass implements Grade{

	@Override
	public double reward(int price) {
		// TODO Auto-generated method stub
		return price*TOPCLASS_RATE;
	}

}
