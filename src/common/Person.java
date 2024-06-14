package common;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


//	객체정보(멤버변수) 반환
	@Override
	public String toString() {
		return String.format("이름: %s, 나이:%d", name, age);
	}
	
	
	
	

}
