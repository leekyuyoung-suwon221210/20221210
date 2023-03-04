package day2_5;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
	
	public static List<Car> findCars(List<Car> all, CarPredicate cp){
		List<Car> result = new ArrayList<Car>();
		for (Car car : all) {
			if(cp.test(car))
				result.add(car);
		}		
		return result;		
	}
	
	public static void printCars(List<Car> all, CarConsumer cc){
		List<Car> result = new ArrayList<Car>();
		for (Car car : all) {
			cc.apply(car);
		}		
	}
	
	public static void main(String[] args) {
		List<Car> carlist = new ArrayList<Car>();
		carlist.add(new Car("그랜저", true, 12, 240000));
		carlist.add(new Car("소나타", true, 2, 40000));
		carlist.add(new Car("아반떼", true, 8, 160000));
		carlist.add(new Car("코나", false, 15, 300000));
		carlist.add(new Car("코란도", false, 20, 400000));
//		// 디젤 자동차만 찾기
//		List<Car> cars = findCars(carlist, c->!c.isGasoline() );
//		printCars(cars, (c)->System.out.println(c) );
//		
//		// 년식이 10년 이상 된 차량만 출력
//		cars = findCars(carlist, c->c.getAge()>=10 );
//		printCars(cars, (c)->System.out.println(c) );
		// 디젤중에서 10년 이상된 차량만 출력
		List<Car> cars = findCars(carlist, c -> !c.isGasoline() && c.getAge()>=10  );
		printCars(cars, (c)->System.out.println(c) );
	}
}







