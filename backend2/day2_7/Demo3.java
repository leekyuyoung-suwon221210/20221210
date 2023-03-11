package day2_7;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo3 {

	static int i = 0;
	public static void main(String[] args) {
		Stream<String> ss;
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders 
        = List.of(Gender.MALE, Gender.FEMALE, 
        		Gender.MALE, Gender.MALE, Gender.MALE, Gender.FEMALE);        
        Stream<Member> sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
        // 스트림안에 있는 맴버들을 차례대로 출력
        sm.forEach(x->System.out.println(x));

        i = 0;
        sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
        // 남자인 멤버만 출력
        System.out.println("------------------------");
        sm.filter(x->x.getGender() == Gender.MALE).forEach(x->System.out.println(x));
        
        // 나이가 평균보다 높은 사람들
        System.out.println("------------------------");
        i = 0;
        sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
        IntStream is = ages.stream().mapToInt(x->x.intValue());
        double avg = is.average().getAsDouble();
        sm.filter(x->x.getAge() >= avg).forEach(x->System.out.println(x));
        

	}
}
class Member{
	private String name;
	private Gender gender;
	private int age;
	// 생성자 통해서 초기화
	// getter
	// toString override
	public Member(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}

