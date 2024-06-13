package ex18lambda;

//2. 익명클래스를 통한 오버라이딩 - implements한 클래스 필요없음

interface ISchool2 {
	void studyLambda(String str);
}

public class Ex02AnonymousClass {
	public static void main(String[] args) {
		
//		익명인 클래스가 제작되어 오버라이딩 됨
		ISchool2 sch = new ISchool2() {
//			상속 절차를 익명클래스가 대체
			@Override
			public void studyLambda(String str) {
				System.out.println(str + "을 공부하기 위해 익명클래스를 만들어요");
			}
		};
		sch.studyLambda("람다식");
		
	}
}
