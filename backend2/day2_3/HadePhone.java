package day2_3;

public class HadePhone implements Weable {
	private int volume;
	
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void puton() {
		System.out.println("해드폰 착용");

	}

	@Override
	public void putoff() {
		System.out.println("해드폰 제거");

	}

}
