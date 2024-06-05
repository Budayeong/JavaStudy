package ex12inheritance;

/*
Is-A 고나계 : X is a Y => X는 Y의일종이다
- 노트북은 컴퓨터의 일종이다
- 휴대폰은 전화기의 일종이다
이와같이 Is-A 관계가 성립하는 객체는 상속으로 표현하기 적합
*/

//컴퓨터 : 기본적인 컴퓨팅 환경을 제공해 입력된 내용을 계산하는 클래스
class Computer { 
	
//	컴퓨터 소유주 
	String owner;
	
	public Computer(String name) {
		owner = name;
	}
	
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다");
	}
//	private으로 선언된 멤버메서드를 외부에서 호출할수있도록 public 메서드로 캡슐화 (순서까지 고려해 정의됨)
	public void calculateFunc() {
		keyboardTouch(); //입력 후에
		calculate(); //계산수행
	}
}

//노트북컴퓨터 : 컴퓨터의 기본 연산기능에 휴대성을 확장해 정의된 클래스
class NotebookComputer extends Computer {
//	자식클래스에서 변수 추가(확장)
	int battary;
	
//	부모클래스에 기본생성자가없기때문에 super(~) 생략불가, 매개변수가있는 생성자를 직접 호출해줘야함
	public NotebookComputer(String name, int initCharge) {
		super(name);
		battary = initCharge;
	}
	
//	배터리충전
	public void charging() {
		battary += 5;
	}
	
//	휴대하면서 노트북을 사용함을 표현
	public void movigCal() {
//		사용 전 배터리 잔량 확인 후 사용여부 판단
		if(battary < 1) {
			System.out.println("배터리가 방전되어 사용불가");
//			메서드에서 return -> 실행중단
			return;
		}
		System.out.print("이동하면서 ");
//		private으로 선언된 메서드는 자식에서 직접 접근 불가
//		keyboardTouch();
//		calculate();
		calculateFunc();
		
		battary -=1;
	}
}

//태블릿노트북 : 컴퓨터의 기본 연산기능, 휴대이 + 전용펜으로 드로잉기능까지 확장해 정의된 클래스
class TabletNotebook extends NotebookComputer {
	
	String registPencil;
	
	public TabletNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	
//	태블릿 사용 : 배터리 체크, 등록 펜 체크
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다");
			return;
		}
		
//		부모클래스에 정의된 메서드 호출 : 자식클래스에서는 부모의 멤버를 자신의 멤버처럼 사용할수있다. (접근이 가능한 접근지정자에 한해)
		super.movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다");
		battary -= 1;
		
	}
}



public class E04ISAInheritance {
	public static void main(String[] args) {
		
		NotebookComputer noteBook = new NotebookComputer("공유", 5);
//		owner: 공유, battary: 5
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");
//		owner: 이동욱, battary: 5, registPencil: ISE-1234
		
		System.out.println("==노트북컴퓨터 사용===");
		noteBook.movigCal(); 
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, battary:4
		noteBook.movigCal();
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, battary:3
		noteBook.movigCal();
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, battary:2
		noteBook.movigCal();
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, battary:1
		noteBook.movigCal();
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, battary:0
		noteBook.movigCal();
		//배터리가 방전되어 사용불가
		noteBook.movigCal();
		//배터리가 방전되어 사용불가
		noteBook.movigCal();
		//배터리가 방전되어 사용불가

		
		System.out.println("== ISE-1234 펜으로 태블릿 사용===");
		tablet.write("ISE-1234");
		//이동하면서 키보드를 통해 입력한 요청된 내용을 계산한다, 스크린에 펜으로 그림을 그린다, battary:3
		
		System.out.println("== XYZ-9876 펜으로 태블릿 사용 ===");
		tablet.write("XYZ-9876");
		//등록된 펜이 아닙니다
		
	}
}
