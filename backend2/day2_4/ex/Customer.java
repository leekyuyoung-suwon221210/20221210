package day2_4.generic.ex;

public class Customer {
	private Grade grad;
	private int totalPrice;
	private String name;
	private double rewardPrice;
	
	public Customer(Grade grad, int totalPrice, String name) {
		this.grad = grad;
		this.totalPrice = totalPrice;
		this.name = name;
		rewardPrice = grad.reward(totalPrice);
	}

	public double getRewardPrice() {
		return rewardPrice;
	}
	 
	
	
	
}
