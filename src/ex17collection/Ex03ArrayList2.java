package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;


public class Ex03ArrayList2 {
	public static void main(String[] args) {
//		아래 2개의 컬렉션은 내부적인 자료구조만 다르고 구현방법은 동일
//		인스턴스 생성 시 Student 형의 타입매개변수를 통해 생성		
		LinkedList<Student> list2 = new LinkedList<Student>();
//		ArrayList<Student> list2 = new ArrayList<Student>();
		
//		List에 저장할 Student 인스턴스 생성
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		
//		List에 인스턴스 추가
		list2.add(st1); 
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
//		List는 중복저장가능(인덱스로 순서구분)
		list2.add(st2);
		
		
		/*
		List의 각 인덱스에 저장된 인스턴스의 참조값을 그대로 출력
		toString() 메서드를 오버라이딩 햇으므로 인스턴스에 저장된 멤버변수값이 출력됨 -> 오버라이딩 하지 않았다면 참조값 출력
		*/
		System.out.println("[출력1-일반for문]");
		for(int i=0 ; i<list2.size() ; i++)
			System.out.println(list2.get(i));
		
//		인스턴스 참조값을 통한 삭제: boolean 값 반환
//			- 동일한 인스턴스가 존재하면 앞에 있는것이 삭제됨
		boolean removeOk = list2.remove(st2); //원빈 삭제
		System.out.println("인스턴스를 통한 삭제: "+ removeOk);
		
		System.out.println("[출력2 - 이터레이터]");
//		컬렉션에 저장된 값을 통해 이터레이터 인스턴스 생성
		Iterator<Student> it2 = list2.iterator();
//		반환할 인스턴스가 있는지 확인 후 true이면 next()로 출력
		while(it2.hasNext())
			System.out.println(it2.next());
		
		
//		시나리오] 컬렉션에 저장된 인스턴스를 이름으로 검색하여 삭제하는 코드를 작성하시오.
//			- 이때 반복문은 확장for문 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요: ");
		String removeName = scanner.nextLine();
		for(Student st: list2) {
//			사용자가 입력한 이름과 list2에 저장되어있는 인스턴스의 멤버변수 name이 같은것을 찾음
			if(removeName.equals(st.getName())) {
//				이름이 일치하는 인스턴스 삭제 후 for문 탈출
				list2.remove(st);
				break;
			}
		}
		System.out.println("현재 객체수: " + list2.size());
		
//		인스턴스의 인덱스를 통해 삭제하면 인스턴스의 참조값이 반환됨 -> 반환값을 통해 인스턴스의 정보 출력 가능
//		현재 remove(2).getName()로 인해 현재 2번인덱스의 인스턴스가 삭제되고 해당 인스턴스의 이름을 출력함 
		System.out.println("삭제된 객체의 이름: " + list2.remove(2).getName());
		
		System.out.println("[출력3-확장 for문]");
		for(Student st : list2)
			System.out.println(st);
		

		
	}
}
