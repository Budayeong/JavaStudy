package ex16ExceptionsBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Friend: 친구를 추상화한 최상위 클래스.
	- 인스턴스 생성 X
	- 기본정보 저장, 상속을 목적으로 정의
	- 데이터를 저장하기 위한 용도의 클래스 VO(Value Object) : 값만 가진 객체
*/
class Friend {
//	멤버변수: 이름, 전화번호, 주소
	String name;
	String phone;
	String addr;
	
//	생성자: 멤버변수 초기화
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
//	showAllData: 멤버변수 현재상태 출력 메서드
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호:" + phone);
		System.out.println("주소: "+  addr);
	}
	
//	showBasicInfo: 기본정보를 출력 메서드, 오버라이딩 목적으로 실행부가 없는 상태로 정의
	public void showBasicInfo() {}
}

/*
HighFriend: 고등학교 친구 정보 저장
*/
class HighFriend extends Friend {
//	멤버변수 확장: 별명
	String nickname;
	
//	생성자: 전달받은 값을 부모 생성자를 호출하고 멤버변수 초기화
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

//	오버라이딩1 : 고등학교친구의 전체정보를 출력. 부모에서 정의한 메서드를 호출하고 자식에서 확장한 변수를 추가해 출력함
	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명:" + nickname);
	} 

//	오버라이딩2: 고등학교친구의 간략한 정보를 출력. 부모클래스에서 실행부가없는 상태로 정의되어있음.
//	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

/*
UnivFriend: 대학교 친구 정보를 저장
*/
class UnivFriend extends Friend {
//	멤버변수 확장: 전공
	String major;
	
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: " + major);
	}

//	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름: "+ name);
		System.out.println("전화번호: " + phone);
	}

	
}

/*
핸들러 클래스: 기능 담당 클래스.
*/
class FriendInfoHandler {
//	멤버변수: 최상위 클래스(Friend)로 인스턴스 배열 생성 -> Friend의 자식타입 인스턴스 모두 저장가능.
	private Friend[] myFriends;
//	배열에 저장된 연락처 정보를 카운트하기 위한 변수, 정보를 추가할때마다 ++
	private int numOfFriends;
	
//	생성자: 입력받은 값의 크기로 Friend배열 생성
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
//		저장된 정보가 없으므로 0으로 초기화
		numOfFriends = 0;
	}
	
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		
//		고등학생 or 대학생 모두 기본정보 입력
		System.out.print("이름: ");
		iName = scan.nextLine();
		
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		
		System.out.print("주소: ");
		iAddr = scan.nextLine();
		
//		입력선택에 따라 고등학생 or 대학생으로 분기하여 입력받음
//		고등학생인 경우
		if(choice == 1) {
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
//			high 객체를 생성해 Friend타입 배열에 추가
//			numOfFriends에 후위연산자를 사용함 -> 0번인덱스에 저장된 후 numOfFriends의 값이 증가한다(1)
			myFriends[numOfFriends++] = high;
		}
//		대학생인 경우
		else if(choice == 2) {
			System.out.print("전공: ");
			iMajor = scan.nextLine();
//			numOfFriends의 현재값 인덱스에 저장된 후, 1증가 (후위연산)
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		
		System.out.println("친구정보 입력이 완료되었습니다.");
	}
	
	
//	저장된 친구정보를 출력
	/*
	1. 친구정보를 추가할때 High, Univ 인스턴스를 배열에 저장
	2. 이때 Friend로 자동형변환(업캐스팅) 되어 저장
	3. 출력시 showAllData가 오버라이딩 되어있으므로 참조변수의 타입 영향없이 항상 자식 클래스에 오버라이딩 된 메서드가 호출됨
	4. 저장된 인스턴스는 Friend 타입이지만 오버라이딩으로 인해 별도의 형변환이 필요하지않다.
	*/
	public void showAllData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	
//	저장된 연락처의 간략정보(2가지)만 출력
	public void showSimpleData() {
//		오버라이딩 이용했을때 : 자식메서드출력을 다운캐스팅없이 간단히 출력가능
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showBasicInfo();
		}
		
//		오버라이딩 이용하지않았을 때 (Friend에 showBasicInfo() 가 없다면)
//		정보가 저장되는 배열은 Friend타입이므로 자식 인스턴스의 메서드를 호출하기 위해서는 배열의 요소가 어떤 타입인지 판단 후 다운캐스팅 해줘야함
//		또한 상속 구조가 복잡해질수록 많은 판단이 필요함
		/*
		for(int i=0 ; i<numOfFriends ; i++) {
			if(myFriends[i] instanceof UnivFriend) 
				((UnivFriend)myFriends[i]).showBasicInfo();
			else if(myFriends[i] instanceof HighFriend)
				((HighFriend)myFriends[i]).showBasicInfo();
		}
		*/
		
		System.out.println("==간략정보가 출력되었습니다.");
	}
	
//	연락처 정보 검색
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String searchName= scan.nextLine();
		
		for(int i=0 ; i<numOfFriends ; i++) {
//			입력된 이름과 비교하기위해 문자열 비교 compareTo or equals를 사용
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다**");
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println("***찾는 정보가 없습니다***");
	}
	
//	연락처 정보 삭제
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
//		삭제된 인덱스의 번호를 저장하기 위한 변수, 인덱스로 사용되지않는번호로 초기화
		int deleteIndex = -1;
		
//		삭제할 인덱스 찾기
		for(int i=0 ; i<numOfFriends ; i++) {
			if(deleteName.compareTo(myFriends[i].name)==0) {
//				인스턴스 삭제 -> null값 
//				참조값이 null 값 : 참조할 인스턴스가 없다.
				myFriends[i] = null;
//				삭제된 원소의 인덱스 저장
				deleteIndex = i;
//				친구정보 카운트 1차감 
				numOfFriends--;
				break;
			}
		}
		
		if(deleteIndex == -1)
			System.out.println("==삭제된 데이터가 없습니다==");
		else {
//			삭제된 데이터가 있는 경우: 삭제한 원소 뒷부분에 있는 원소들을 하나씩 앞으로 이동시킴.
//			이부분이 처리되지않으면 차후 검색, 출력 시 NullPointerException 발생 위험
			for(int i=deleteIndex ; i<numOfFriends ; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터(" + deleteIndex + "번)가 삭제되었습니다==");
		}
		
	}
	
	
}



/*
메인 프로그램
*/
public class Ex07MyFriendInfoBook {
//	메뉴출력 메서드, 객체없이 생성하기 위해 static 선언
	public static void menuShow() {
		System.out.println("########### 메뉴를 입력하세요 ###########");
		System.out.print("1. 고딩친구입력 ");
		System.out.println("2. 대딩친구입력");
		System.out.print("3. 전체정보출력 ");
		System.out.println("4.간략정보출력 ");
		System.out.print("5. 검색 ");
		System.out.print("6. 삭제 ");
		System.out.println("7. 프로그램종료");
		System.out.print("메뉴선택 >>>");
	}
	
//	메인메서드: 프로그램의 시작점(Entry Point)로 프로그램의 전반적인 흐름에 대해서만 기술하는 것이 좋음.
//		따라서 선택한 메뉴에 따라 핸들러 클래스의 메서드만 호출하는 형태로 구현.
	public static void main(String[] args) {
		
//		사용자 입력을 위한 인스턴스 생성
		Scanner scan = new Scanner(System.in);
//		기능을 담당하는 핸들러 클래스 인스턴스 생성
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
//		무한루프: 사용자가 원할 때 종료할 수 있도록.
		while(true) {
//			1. 메뉴출력
			menuShow();
			
			int choicee;
			
//			2. 사용자로부터 수행할 기능의 메뉴 입력 받음
			try {
				choicee = scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("메뉴는 숫자로 입력하세요");
				scan.nextLine();
				continue;
			}
			
//			3. 선택한 번호에 따라 메서드 호출
			switch(choicee) {
			case 1: case 2:
				handler.addFriend(choicee);
//				break: 반복문 탈출
				break;
			
			case 3:
				handler.showAllData();
				break;
				
			case 4:
				handler.showSimpleData();
				break;
			
			case 5:
				handler.searchInfo();
				break;
			
			case 6:
				handler.deleteInfo();
				break;
			
			case 7:
				System.out.println("프로그램종료");
//				main메서드 종료 -> 프로그램 전체 종료
				return;
			}
	
		}
	}
	
}
