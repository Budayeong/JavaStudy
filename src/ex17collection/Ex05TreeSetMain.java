package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet<T> 컬렉션
: 트리 자료구조 기반 set계열 컬렉션
- set의 기본 특성은 동일하나 인스턴스가 정렬되어 저장됨 (이때, 저장 시 순서가 보장된다는 뜻이아님!!!)
	=> 정렬의 기준을 직접 정의가능
*/

//클래스 생성 시 정렬의 기준을 만들어주기 위해서는 Comparable<T> 인터페이스를 implements 해야함
class MyString implements Comparable<MyString> {
	String str;

	public MyString(String str) {
		this.str = str;
	}

//	멤버변수의 문자열 길이 반환
	public int getLength() {
		return str.length();
	}

	/*
	TreeSet<T>에 객체를 저장할 때 정렬을 위해 compareTo() 메서드를 오버라이딩.
	정렬의 기준은 직접 정의.
	현재는 문자열의 길이를 기준으로 오름차순 정렬.
	1과 -1의 위치가 바뀌면 내림차순이 됨.
	*/
	@Override
	public int compareTo(MyString paramStr) {
//		# 문자열의 길이를 기준으로 오름차순 정렬
		if(getLength() > paramStr.getLength())
			return 1;
		else if (getLength() < paramStr.getLength())
			return -1;
		else 
			return 0;
		
//		# 문자열의 abc순서대로 오름차순 정렬
//		if(this.str.charAt(0) > paramStr.str.charAt(0))
//			return 1;
//		else 
//			return -1;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

public class Ex05TreeSetMain {
	public static void main(String[] args) {
		
//		Java 기본클래스의 경우 별도의 오버라이딩없이도 오름차순정렬되어 저장
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
//		set컬렉션임 -> 중복저장 안됨
		tree1.add(2);
		
		System.out.println("저장된 데이터 수: " + tree1.size() + "개");
		
		Iterator<Integer> itr = tree1.iterator();
//		오름차순 정렬된 상태로 출력
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		=============================================================
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moom"));
		tree2.add(new MyString("JavaWeb"));
		
		Iterator<MyString> it = tree2.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
