package common;

public class Student extends Person {
	
	private String stNumber;

	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}

	@Override
	public String toString() {
		return super.toString() + ", 학번:" + stNumber ;
	}

	@Override
	public boolean equals(Object obj) {
		Student st = (Student)obj;
		if(this.getName()==st.getName()) {
			System.out.print("오버라이딩 한 equals() 호출됨: " + st.getName());
			return true;
		}
		return false;
	}
	
	
	

}
