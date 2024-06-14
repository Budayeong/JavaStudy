package ex16ExceptionsBasic;

public class Ex02PreDefineException1 {
	public static void main(String[] args) {
		
		/*
		try: 예외 발생 가능성이 있는 지역
			- 예외가 발생되면 JVM이 해당 예외 인스턴스를 만들어 프로그램쪽으로 thorw함
		catch: 예외인스턴스를 받아 처리하는 지역
		 	- catch에서 해당되는 예외인스턴스를 받지 못하면 예외가 처리되지않음
		*/
		
		System.out.println("### ArrayIndexOutOfBoundsException ###");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은: " + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은: " + intArr[1]);
//			예외발생지점
			intArr[2] = 300;
			System.out.println("앗 이방은?? " + intArr[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
//			JVM이 throw한 예외인스턴스를 catch절에서 받을 수 있는 인스턴스이면 받아 처리함
//			예외메세지1. 개발자 임의로 메세지 출력
			System.out.println("예외 발생");
//			예외메세지2. 예외 객체 내 getMessage() 메서드로, 간략한 설명 출력
			System.out.println("예외메세지: "  + e.getMessage());
//			예외메세지3. 예외에 대한 디테일한 설명 출력
			e.printStackTrace();
		}
		
//		예외처리를 통해 실행의 흐름이 중단되어 프로그램이 비정상적 중단이 되지않게 하는 것이 예외처리의 목적
		System.out.println("0번방 재출력: "  + intArr[0]);
		System.out.println(" ### ArrayIndexOutOfBoundsException 발생 후###");
		
	}
}
