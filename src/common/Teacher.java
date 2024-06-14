package common;

import java.util.Objects;

public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() +", 과목: " + subject;
	}
	
	
//	시나리오] Teacher 객체는 나이와 과목이 같으면 동일한 객체로 처리하도록 hashCode와 equals 메서드를 적절히 오버라이딩하시오
	/*
	hashCode() 
	: 인스턴스가 가진 고유한 주소값으 정수형으로 반환해줌
	- 서로 다른 인스턴스라면 다른 해시값을 가짐
	- 인스턴스형 변수는 hashCode()를 통해 정수값으로 반환되는 해시값을 사용하면됨
	*/
	@Override
	public int hashCode() {
//		방법1. 정수형변수와 인스턴스의 해시값을 합산 후 그대로 반환
		int returnCode1 = super.getAge() + this.subject.hashCode();
		System.out.println("returnCode1= " + returnCode1);
//		방법2. Objects클래스의 hash메서드 사용 -> 멤버변수를 인수로 전달하면 위와 동일하게 고유한 주소값을 정수형으로 반환해줌
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		System.out.println("returnCode2= " + returnCode2);
		
		return returnCode2;
	}
	
//	equals() : 인스턴스가 가진 멤버변수의 값을 비교하도록 오버라이딩
	@Override
	public boolean equals(Object obj) {
//		현재 클래스와 동일한 클래스(타입)로 다운캐스팅
		Teacher teacher = (Teacher) obj;
		System.out.println("equals() 호출됨");
//		subject는 String타입으로 값 비교를 위해 equals()사용
		if ((teacher.getAge()==super.getAge()) && (teacher.subject.equals(this.subject)))
//			객체의 나이와 과목이 동일하면 동일한 객체라고 판단 -> true 반환
			return true;
		else 
//			객체가 다르다고 판단되면 false반환 -> set에 정상적으로 추가
			return false;	
	}
	
	
	
	
}
