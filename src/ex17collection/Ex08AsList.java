package ex17collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ex08AsList {
//	list컬렉션을 매개변수로 받아 전체 출력
	public static void listPrint(String title, List<String> list) {
//		타이틀 출력
		System.out.println("# " + title);
//		리스트 출력
		for(Object ob : list)
//			출력할 인스턴스가 String(기본클래스) 이므로 별도의 오버라이딩 없이 내용출력 가능
//			직접 정의한 클래스라면 내용출력을 위해 toString()을 적절히 오버라이딩 해야함
			System.out.print(ob + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] strArr = new String[] {"마린", "파이어뱃", "메딕", "마린"};
		/*
		 Arrays.asList(배열) : 일반배열을 List<T> 컬렉션으로 변경
		 	- 값 참조만 가능, 입력/삭제 등 조작 불가
		*/
		List<String> list = Arrays.asList(strArr);
		listPrint("출력1", list);
//		변환 후 값 조작이 불가능하기때문에 런타임 에러
//		list.add("탱크");
		
		/*
		ArrayList<E> 의 생성자를 통해 앞의 인스턴스를 복사해 사용 
		-> 데이터 조작 가능
		*/
//		arrayList 인스턴스를 생성해 앞선 변환한 List<> 객체를 복사함
		list = new ArrayList<String>(list);
//		복사 이후에 데이터 추가 가능
		boolean isAdd = list.add("탱크");
		System.out.print("add결과: " + isAdd);
		listPrint("출력2", list);
		
		/*
		이터레이터를 for문을 이용해 출력
		for(초기값 ; 조건식 ; 증감식) {
			print(next()가 증감식 대체);
		}
		*/
		System.out.println("# 출력 3");
		for(Iterator<String> itr = list.iterator() ; itr.hasNext(); )
			System.out.print(itr.next()+" ");
		System.out.println();
		
		/*
		Set<E> 컬렉션은 중복 비허용 
		-> List에 저장된 중복값을 제거할 수 있음
		*/
		HashSet<String> set= new HashSet<String>(list);
		list = new ArrayList<String>(set);
		listPrint("출력4", list);
		
	}
}
