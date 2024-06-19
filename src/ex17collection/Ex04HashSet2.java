package ex17collection;

import java.util.HashSet;

import common.Teacher;

public class Ex04HashSet2 {
	public static void main(String[] args) {
		
//		Teacher인스턴스 저장 set 생성
		HashSet<Teacher> hashSet = new HashSet<Teacher>();
		
//		Teacher인스턴스 생성 및 hashSet에 저장
		Teacher t1 = new Teacher("정우성", 40, "국어");
		Teacher t2 = new Teacher("황정민", 42, "영어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		
		hashSet.add(t1);
		hashSet.add(t2);
		hashSet.add(t3);
		
//		모든 매개변수가 다 다르기때문에 3개 저장
		System.out.println("hashSet의 크기: " + hashSet.size());
		
//		시나리오] 나이와 과목이 동일하면 이름이 달라도 같은 것으로 판단
//		시나리오상으로 t1과 동일한 인스턴스를 추가 저장 -> Teacher클래스에 오버라이딩을 하지않으면 같은 인스턴스인데 중복저장됨
		Teacher t1Same = new Teacher("이정재", 40, "국어");
		System.out.println("t1Same의 저장여부: " + hashSet.add(t1Same));
		System.out.println("hashSet의 크기: "+ hashSet.size());
		
		
	}
}
