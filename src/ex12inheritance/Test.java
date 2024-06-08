package ex12inheritance;

import java.util.Scanner;


class FriendT {
	String name;
	String phone;
	String addr;
	
	
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + phone);
		System.out.println("주소: " + addr);
	}
	
	public void showSimpleData() {}
	
	public FriendT(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
}

class HighFriendT extends FriendT {
	String nickName;
	
	@Override
	public void showAllData() {
		System.out.println("====고딩친구====");
		super.showAllData();
		System.out.println("별명: " + nickName);
	}
	
	@Override
	public void showSimpleData() {
		System.out.println("======고딩친구=======");
		System.out.println("이름: " + name);
		System.out.println("별명: " + nickName);
	}
	
	public HighFriendT(String name, String phone, String addr, String nickName) {
		super(nickName, phone, addr);
		this.nickName = nickName;
	}
}

class UnivFriendT extends FriendT {
	String major;
	
	@Override
	public void showAllData() {
		System.out.println("====대딩친구====");
		super.showAllData();
		System.out.println("전공: " + major);
	}
	
	@Override
	public void showSimpleData() {
		System.out.println("======대딩친구=======");
		System.out.println("이름: " + name);
		System.out.println("전공: "+ major);
	}
	
	public UnivFriendT(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
}


//기능담당
class FriendInfoHandlerT {
	
	FriendT[] friendList;
	int friendCount = 0;
	HighFriendT high;
	UnivFriendT univ;
	
//	생성자: 입력받은 값의 크기로 친구 연락처 배열 크기 설정
	public FriendInfoHandlerT(int num) {
		friendList = new FriendT[num];
	}
	
//	친구정보추가
	public void addFriend(int choicee) {
		String iName, iPhone, iAddr, iNickname, iMajor;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름: "); iName = scan.nextLine();
		System.out.println("번호: "); iPhone = scan.nextLine();
		System.out.println("주소: "); iAddr = scan.nextLine();
		
		if(choicee==1) {
			System.out.println("별명: "); iNickname = scan.nextLine();
			high = new HighFriendT(iName, iPhone, iAddr, iNickname);
			friendList[friendCount++] = high;
		}
		else if (choicee==2) {
			System.out.println("전공: "); iMajor = scan.nextLine();
			univ = new UnivFriendT(iName, iPhone, iAddr, iMajor);
			friendList[friendCount++] = univ;
		}
	}

//	친구정보 전체 출력
	public void showAllData() {
//		배열에 요소가 저장된 인덱스까지 반복
		for(int i=0 ; i<friendCount ; i++) {
			friendList[i].showAllData();
		}
		
//		배열 전체 요소가 들어있지않으면 사용 불가
//		for(FriendT e : friendList) 
//			e.showAllData();
	}

//	친구 요약정보 출력
	public void showSimpleData() {
		for(int i=0 ; i<friendCount ; i++) {
			friendList[i].showSimpleData();
		}
	}
	
//	검색
	public void searchInfo() {
		String searchName;
		System.out.println("검색할 이름을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		searchName = scan.nextLine();
		
		for(int i=0 ; i<friendCount ; i++) {
			if(friendList[i].name.equals(searchName)) {
				friendList[i].showAllData();
				return;
			}
//			!!!!! == 는 스택 메모리 값을 비교하기때문에 문자열의 내용 항상 비교하지않는다.
//			System.out.println(friendList[i].name == searchName);
		}
//		System.out.println("**" + searchName + " 정보없음**");
		System.out.println("**" + searchName + " 정보 없음**");
	}
	
//	삭제
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		int deleteIndex = -1;
		
//		1.인덱스번호 없이 바로
		for(int i=0 ; i<friendCount ; i++) {
			if(friendList[i].name.equals(deleteName)) {
//				객체삭제
				friendList[i] = null;
				System.out.println(i+"번째 데이터 삭제되었습니다");
				friendCount--;
//				삭제된 데이터 뒤의 데이터를 앞으로 한칸씩 옮김
				for(int j=i ; j<friendCount ; j++) {
					friendList[j] = friendList[j+1];
				}
				return;
			}
		}//for문 끝
//		삭제할 데이터가 없을 때
		System.out.println("해당정보가없습니다");
		
		
//		2. 인덱스번호 저장
//		for(int i=0 ; i<friendCount ; i++) {
//			if(friendList[i].name.equals(deleteName)) {
////				객체삭제
//				friendList[i] = null;
//				System.out.println(i+"번째 데이터 삭제되었습니다");
//				friendCount--;
//				deleteIndex=i;
//				break;
//			}
//		}//for문 끝
//
//		if(deleteIndex==-1)
//			System.out.println("해당정보가없습니다");
//		else {
//			for(int k=deleteIndex ; k<friendCount ; k++) {
//				friendList[k] = friendList[k+1];
//			}
//		}
		
		
		
		
		
	}
	
	
}//핸들러끝

public class Test {
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
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FriendInfoHandlerT handler = new FriendInfoHandlerT(100);
		
		while(true) {
			menuShow();
			
			int choicee = scan.nextInt();
			
			switch(choicee) {
			case 1: case 2:
				handler.addFriend(choicee);
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
				return;
			}
	
		}
	}
	
}
