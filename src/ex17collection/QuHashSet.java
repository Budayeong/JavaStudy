package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
컬렉션 set에 저장된 객체를 이름으로 검색하자. 해당 정보가 있으면 해당 어벤져스의 정보를 출력하고
없으면 "해당 영웅은 없어요ㅜㅜ" 라는 메시지 출력해야 한다. 검색 부분은 Iterator를 통해 구현하도록
한다.
set계열의 컬렉션은 기본적으로 중복저장을 허용하지 않는다. 그러나 아래와 같이 새롭게 정의한 클래스에
대해서는 equals(), hashCode() 메소드를 적절히 오버라이딩 처리해야 중복을 제거할 수 있다. 메소드
오버라이딩을 통해 hero4 는 입력되지 않도록 Avengers 클래스를 업데이트 하시오.

실행결과]
중복 제거용 equals()메소드 호출
[최초 전체 정보출력]
Avengers [본명=스티브로져스, 닉네임=캡틴아메리카, 능력=비브라늄 방패]
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
Avengers [본명=토니스타크, 닉네임=아이언맨, 능력=Mark-48 수트]
검색할 이름을 입력하세욤:브루스배너
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
요청하신 정보를 찾았습니다

*/

class Avengers {
	String name;
	String heroName;
	String weapon;
	
	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "+ "능력=" + weapon +"]";
	}
	
	@Override
	public int hashCode() {
		int hashCode = Objects.hash(name);
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		Avengers avenger = (Avengers)obj;
		if(this.name.equals(avenger.name))
			return true;
		else
			return false;
	}
	
}

public class QuHashSet {
	public static void main(String[] args) {
		HashSet<Avengers> set = new HashSet<Avengers>();
		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);
		
		System.out.println("[최초 전체 정보출력]");
		
		for(Avengers av : set)
			System.out.println(av.toString());
		
//		사용자로부터 검색할 이름 입력받기
		System.out.print("검색할 이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		boolean searchEnd = false;
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers av = itr.next();
//			1. 해당이름으로 검색된 자료가 있다면 내용 출력
			if(av.name.equals(searchName)) {
				System.out.println(av);
				searchEnd=true;
			}
		}
//		2. 해당이름으로 검색된 자료가 없다면 안내문 출력
		if(searchEnd)
			System.out.println("요청하신 정보를 찾았습니다");
		else	
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		
		
		
		
	}	
}
