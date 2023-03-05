package day2_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.ToIntFunction;

import day2_5.Car;

public class FuntionalDemo2 {
	
	// 평균함수
	private static Double average(List<Car> carlist, ToIntFunction<Car> f) {
		Double total = 0.0;
		for (Car car : carlist) {
//			함수형인터페이스메소드.메소드
			total += f.applyAsInt(car);			
		}		
		return total / carlist.size();
	}
	
	public static void main(String[] args) {
		List<Car> carlist = new ArrayList<Car>();
		carlist.add(new Car("그랜저", true, 12, 240000));
		carlist.add(new Car("소나타", true, 2, 40000));
		carlist.add(new Car("아반떼", true, 8, 160000));
		carlist.add(new Car("코나", false, 15, 300000));
		carlist.add(new Car("코란도", false, 20, 400000));
		
		// 함수형 인터페이스를 새로만들거나 또는 기존거 사용거나 해서
		// 평균 연식
		// 평균 주행거리		
		System.out.println("평균연식 : "+average(carlist, c -> c.getAge() ));
		System.out.println("평균주행거리 : "+average(carlist, c -> c.getMileage() ));	
				
	}

}
