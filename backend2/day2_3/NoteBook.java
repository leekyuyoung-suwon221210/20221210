package day2_3;

public class NoteBook extends Repaire implements Controllerable	{

	@Override
	public void turnOff() {
		System.out.println("노트북 전원 off");		
	}
	@Override
	public void turnOn() {
		System.out.println("노트북 전원 on");		
	}
	@Override
	void repaire() {
		System.out.println("노트북 수리");
	}
	

}
