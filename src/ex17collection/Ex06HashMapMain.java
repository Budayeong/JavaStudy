package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
HashMap<K,V> : Map<T> 인터페이스를 구현한 컬렉션
- Key, Value의 쌍으로 인스턴스 저장
- Key값은 중복 불가. 같은 키 값으로 데이터를 저장하면 기존의 데이터를 덮어쓴다
- Key값으로 검색되므로 다른 컬렉션에 비해 속도가 빠르다
- 저장 순서는 유지되지 않는다
*/
public class Ex06HashMapMain {
	public static void main(String[] args) {
		
//		Map 컬렉션 생성
		HashMap<String, String> map = new HashMap<String, String>();
		
//		객체저장: 저장(put) 시 해당 key값에 저장되어있던 인스턴스의 값이 반환됨
//		즉, 처음 저장하는 것이면 null 반환
		System.out.println("name이라는 키값으로 저장된 이전의 값: " + map.put("name", "홍길동"));
		
		int number = 20;
//		int (Integer로 들어감) -> String은 자동 형변환 불가 => 에러 
//		map.put("age", number);
//		정수는 문자열로 변경 후 저장
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		System.out.println("저장된 객체 수: " + map.size());
		
//		중복저장: 동일한 key값에 다른 값을 넣으면 -> 기존 데이터를 새로운 데이터가 덮어씀
		System.out.println("name이라는 키값으로 저장된 이전의 값: " + map.put("name", "최길동")); //기존에 name에 저장되어있던 value가 반환됨 
//		기존 name이 변경되었기때문에 객체 수는 그대로 4개
		System.out.println("키값으로 중복 저장 후 객체 수: " + map.size());
		
//		출력하기
//		1. 키값을 알고 있을 때 : get(key)
		System.out.println("키값을 알 때: "+ map.get("name"));
		
//		2. 키값을 모를 때 : keySet() 메서드를 통해 전체 key를 set 컬렉션으로 얻어옴 -> 해당 반환값을 확장 for문으로 반복하며 value값 인출가능
		Set<String> keys = map.keySet();
		System.out.println("[확장 for문 적용]");
		for(String key: keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
//		3.이터레이터를 통한 출력 : keySet() 을 통해 key값을 얻어온 후 반복 출력
		System.out.println("[이터레이터 사용]");
		Set<String> keys2 = map.keySet();
//		얻어온 key를 통해 이터레이터 인스턴스 생성
		Iterator<String> it = keys2.iterator();
//		key가 있는지 확인
		while(it.hasNext()) {
//			존재하면 key를 인출 후 key에 해당하는 value 인출
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
//		value만 얻어와야 할때 : values() 메서드를 통해 값만 인출가능
		System.out.println("[value값들만 출력]");
		Collection<String> values = map.values();
		for (String value : values)
			System.out.println(value);
		
//		존재유무확인 : key값과 valuer값을 각각의 메서드로 존재유무 확인 가능
		System.out.println(map.containsKey("name") ? "name키 값 있다" : "name키 값 없다");
		System.out.println(map.containsKey("account") ? "account키 값 있다" : "account키 값 없다");
		System.out.println(map.containsValue("남자") ? "남자 값 있다" : "남자키 값 없다");
		System.out.println(map.containsValue("여자") ? "여자 값 있다" : "여자키 값 없다");
		
//		삭제 : Key를 통해 삭제하고 삭제에 성공하면 해당 value 반환
		System.out.println("삭제된 객체: " + map.remove("age"));
		System.out.println("[age키 값을 삭제 후 출력]");
		for(String key : keys) 
			System.out.println(String.format("%s:%s", key, map.get(key)));
		
//		전체삭제 : clear()
		map.clear();
		System.out.println("전체삭제 후 객체 수: " + map.size());
		
	}
}
