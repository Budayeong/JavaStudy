package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
ArrayList<E> : List 계열의 컬렉션
- 데이터 중복 저장 허용
- 데이터 저장 순서 보장
- 데이터 접근 : get() or iterator() 이용
- 배열의 특성을 가지고 있음 -> index를 통한 저장 및 접근 가능
*/

public class Ex03ArrayList1 {
	public static void main(String[] args) {
		
//		String 인스턴스를 저장할 수 있는 List 컬렉션 생성
//		다른 컬렉션들은 데이터 저장 자료구조만 다를 뿐 사용법은 동일
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		
		/*
		인스턴스 저장 : add()
			- add(인스턴스)	 : 인덱스를 0부터 부여하며 순차 저장
			- add(인덱스, 인스턴스) : 데이터 저장 시 인덱스 직접 부여, 인덱스를 건너뛰면 에러발생
									지정한 인덱스에 이미 인스턴스가 존재하면 삽입(끼워넣기) 가 된다.
		*/
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"소방차"); //런타임 에러
		
		/*
		저장된 객체 수 (리스트의 크기) : size()
			컬렉션에 저장된 인스턴스 개수 반환, 배열 length와 동일
		*/
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "방탄소년단");
		System.out.println("중복 저장 전 객체 수: " + list.size());
		
//		중복저장: List는 순서의 의미가 있어 데이터 구분가능 -> 중복저장 가능
//		add()는 인스턴스 추가에 성공할 경우 true 반환함
		System.out.println(list.add("트와이스") ? "중복저장됨" : "중복저장안됨");
		System.out.println("중복 저장 후 객체 수: " + list.size() );
		
		/*
		컬렉션 출력 시 아래 3가지 방법 사용
		방법1. 일반 for문, 인덱스를 통해 접근해야하므로 get() 사용
		*/
//		출력하기
		System.out.println("\n[일반 for문 사용]");
		for(int i=0 ; i<list.size() ; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		/*
		방법2. 확장 for문, 전체 원소가 반복되므로 간단현 표현 가능
		*/
		System.out.println("\n[확장 for문 사용]");
		for(String obj : list) {
			System.out.print(obj + " ");
		}
		
		/*
		방법3. Iterator 사용, 
			1. 컬렉션에 저장된 내용을 Iterator 객체에 알려주기 위해 인스턴스 생성
			2. hasNext()로. 인출할 인스턴스가 있는지 검사. 없다면 false반환
			3. next()를 통해 인스턴스 호출
		*/
//		Iterator사용법
		System.out.println("\n[반복자(Iterator) 사용]");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n====================\n");
		
//		덮어쓰기 : 기존 내용 변경, 기존 내용 삭제 후 새로운 내용으로 갱신함
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list ) {
			System.out.print(obj + " ");
		}
		System.out.println("\n====================\n");
		
		/*
		삽입하기 : add(삽입할 인덱스, 인스턴스)
			해당 인덱스에 인스턴스를 삽입. 기존 인스턴스는 뒤로 1칸씩 밀려남
			즉, 자동으로 인덱싱해준다
		*/
		list.add(4, "블랙핑크>삽입하기");
		for(Object obj : list ) {
			System.out.print(obj + " ");
		}
		System.out.print("\n====================\n");
		
		/*	
		포함여부 확인 
			contains(인스턴스) : 특정 인스턴스가 저장되어 있는지 확인. 존재하면 true 반환
		*/
		System.out.println(list.contains("빅뱅") ? "빅뱅있음" : "빅뱅 없음");
		System.out.println(list.contains("블랙핑크") ? "블랙핑크 있음" : "블랙핑크 없음");
		
		/*
		삭제 방법 1.
			remove(인덱스) : 인덱스를 통해 삭제 진행, 삭제가 완료되면 해당 인스턴스를 반환.
				삭제 후에는 인덱스가 자동으로 부여됨. 삭제 성공시 해당 인스턴스의 참조값을 반환하므로 삭제 즉시 확인가능
		*/		
		
//		2번 인덱스(트와이스) 삭제 후 반환
		Object obj = list.remove(2);
		System.out.println("삭제된 객체: " + obj);
		
		/*
		삭제 방법1-1.
		indexOf()를 통해 해당 인스턴스의 인덱스를 찾은 후 삭제 
		인덱스를 찾는 과정이 없으면 1과 동일
		*/		
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index= " + index);
		list.remove(index);
		
		/*
		삭제 방법 2.
		인스턴스의 참조값을 통해 삭제. 삭제 성공 시 true 반환(boolean타입 반환값)		
		*/		
		System.out.println(list.remove("방탄소년단") ? "삭제성공(방탄)" : "삭제실패(방탄)");
		System.out.println(list.remove("오마이걸") ? "삭제성공(오마이걸)" : "삭제실패(오마이걸)");
		System.out.println("삭제 후 출력");
		for(Object ob : list ) {
			System.out.print(ob + " ");
		}
		System.out.println();
		
		/*
		전체삭제: 아래 2개의 메서드를 통해 컬렉션에 저장된 전체 데이터 삭제 가능
		 */
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제 후 객체 수: " + list.size());
		
		
	}
}
