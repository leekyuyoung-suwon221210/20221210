package day2_5;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isGasoline() {
		return gasoline;
	}
	public void setGasoline(boolean gasoline) {
		this.gasoline = gasoline;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Car(String model, boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}
	
}
