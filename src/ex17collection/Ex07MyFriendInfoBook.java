package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
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
	
//	private Friend[] myFriends;
//	private int numOfFriends;
	
//	기존 배열 -> ArrayList 컬렉션으로 변경
//	Friend 클래스의 자식까지 저장하기위해 Friend 타입의 컬렉션으로 선언
	private ArrayList<Friend> lists;
	
	public FriendInfoHandler(int num) {
//		myFriends = new Friend[num];
//		numOfFriends = 0;
//		생성자에서 컬렉션 객체 생성
		lists = new ArrayList<Friend>();
		}
	
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		System.out.print("이름: ");
		iName = scan.nextLine();
		
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		
		System.out.print("주소: ");
		iAddr = scan.nextLine();
		
		if(choice == 1) {
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
//			List<E>는 자동인덱싱 지원 -> 인덱스를 지정하지 않고 저장가능
			lists.add(high);
		}
		else if(choice == 2) {
			System.out.print("전공: ");
			iMajor = scan.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		
		System.out.println("친구정보 입력이 완료되었습니다.");
	}
	
	public void showAllData() {
//		일반 for문 사용 -> get(i) 메서드 사용
		for(int i=0 ; i<lists.size() ; i++) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	
	public void showSimpleData() {
//		확장 for문 사용 -> 인덱스없이 메서드호출 가능
		for(Friend fr : lists)
			fr.showBasicInfo();
		
		System.out.println("==간략정보가 출력되었습니다.");
	}
	
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String searchName= scan.nextLine();

		
//		for(int i=0 ; i<numOfFriends ; i++) {
//			if(searchName.compareTo(myFriends[i].name)==0) {
//				myFriends[i].showAllData();
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다**");
//				isFind = true;
//			}
//		}
//		if(isFind==false)
//			System.out.println("***찾는 정보가 없습니다***");
		
//		인터레이터 인스턴스 생성
		Iterator<Friend> itr = lists.iterator();
		while(itr.hasNext()) {
//			저장된 인스턴스 인출
			Friend fr = itr.next();
//			입력한 이름과 동일한 이름이 있다면
			if(searchName.compareTo(fr.name)==0) {
//				정보출력
				fr.showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다**");
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println("***찾는 정보가 없습니다***");
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		int deleteIndex = -1;
		
//		for(int i=0 ; i<numOfFriends ; i++) {
//			if(deleteName.compareTo(myFriends[i].name)==0) {
//				myFriends[i] = null;
//				deleteIndex = i;
//				numOfFriends--;
//				break;
//			}
//		}
//		
//		if(deleteIndex == -1)
//			System.out.println("==삭제된 데이터가 없습니다==");
//		else {
//			for(int i=deleteIndex ; i<numOfFriends ; i++) {
//				myFriends[i] = myFriends[i+1];
//			}
//			System.out.println("==데이터(" + deleteIndex + "번)가 삭제되었습니다==");
//		}
		
//		확장for문을 통해 반복해 삭제할 이름 검색
		for(Friend fr : lists) {
			if(deleteName.compareTo(fr.name)==0) {
				lists.remove(fr);
//				삭제가 되었는지 안되었는지 판단하기 위한 변수로 사용
				deleteIndex = 1;
				break;
			}
		}
		
		if(deleteIndex == -1)
			System.out.println("==삭제된 데이터가 없습니다==");
		else
			System.out.println("==데이터가 삭제되었습니다==");
		
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
			
//			2. 사용자로부터 수행할 기능의 메뉴 입력 받음
			int choicee = scan.nextInt();
			
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
