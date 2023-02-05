클래스 만드는 규칙

캡슐화 private - 대상 (특별한 경우가 없으면 변수는 모두)
생성자를 만들면 기본생성자는 특별한 경우가 아니면 만들어 둘것

생성자 - 변수가 있으면 매개변수 생성자를 제공해서
         - 사용자가 적절하게 초기화 할수 있도록 제공
생성자 위임 - 생성자안에서 또 다른 생성자 호출
        - 클래스 안에서 생성자 호출은 반드시
        - 생성자 안에서, 그리고 first statement
생성자 : 대표적인 overload
생성자의 종류 : 
   - 기본생성자 : 생략되어 있다 - 만약 어떠한 종류의 생성자가 만들어지면 사라짐
   - 매개변수 생성자 : 매개변수를 가지는 생성자
   
메소드 체이닝( 연속 호출)
set 계열의 캡슐화된 함수의 리턴 타입은 클래스 이고 this를 리턴하면 된다.

작성
public Staff setName(String name){
         this.name = name;
         return this;
}


사용
Staff s = new Staff();
s.setName("kim").setOOO().setOOO()
