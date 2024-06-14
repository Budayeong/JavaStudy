package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
HashSet<E> : set계열의 컬렉션
- Set 계열의 인터페이스를 구현한 컬렉션
- Set: 집합의 특성 
	- 인스턴스가 순서없이 저장됨
	- 인스턴스의 중복저장 허용 X
- 기본클래스 (String, Iterator 등) 인 경우 별도의 처리없이 중복이 제거됨
- 개발자 정의 클래스라면 hashCode(), equals()에 직접 중복판단을 할 내용을 적절히 오버라이딩을 해야만 중복 제거 가능
*/
public class Ex04HashSet1 {
	public static void main(String[] args) {
		
//		Object 타입 HashSet 컬렉션 생성 
		HashSet<Object> set = new HashSet<Object>();
//		제네릭기반 컬렉션에서 타입을 지정하지않으면 Obejct타입으로 생성됨
//		HashSet set = new HashSet();
//		HashSet<Object> set = new HashSet();
		
//		3가지 기본 클래스, 사용자지정 Teacher클래스 인스턴스 생성
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
//		객체저장 : add(인스턴스) -> 저장 성공하면 true반환
		System.out.println("add결과: " + set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
//		size()를 통해 저장된 인스턴스 개수 출력
		System.out.println("[중복 저장 전 객체 수]: " + set.size());
		
//		기본 클래스의 객체 중복저장: 저장 전과 후의 객체수가 동일함 -> 별도의 오버라이딩 처리없이도 중복 제거됨을 알 수 있음
		System.out.println(set.add(varString2) ? "저장성공" : "저장실패");
		System.out.println("[중복 저장 후 객체 수]: " + set.size());
		
//		이터레이터를 통한 객체 출력 : 순서없이 저장되므로 출력 순서도 랜덤
//		이터레이터 타입 매개변수 생략 -> Object타입임
		
//		1. set 참조변수를 통해 Iterator 인스턴스 생성
		Iterator itr = set.iterator();
//		2. 일치하는 인스턴스가 있는지 확인
		while(itr.hasNext()) {
//			3. 일치하는 인스턴스가 있으면 next()를 통해 인출
			Object object = itr.next();
//			set에 저장될때 Object 타입으로 업캐스팅되어 저장되었기 때문에 인출 후 자식메서드에 접근하기 위해선 다운캐스팅 필요
			if(object instanceof Teacher)
				System.out.println("Teacher객체=> " + ((Teacher) object).getName());
			else 
				System.out.println("저장된 객체: " + object);
		}
		
//		포함여부 확인 : 데이터가 저장되어있으면(포함) true반환
		System.out.println(set.contains(varString1) ? "varString1있음" : "varString1 없음");
		
//		객체삭제 : remove(객체)는 삭제성공여부 반환
		System.out.println(set.remove(varString2) ? "varString2 삭제성공" : "varString2 삭제 실패");
		
//		전체삭제
		set.clear();
		System.out.println("전체삭제: " + set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수]: " + set.size());
		
		
	}
}
