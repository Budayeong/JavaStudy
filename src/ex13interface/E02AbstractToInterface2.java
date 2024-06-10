package ex13interface;

/*
추상클래스를 인터페이스로 변경하기
	- abstract class => interface
	- 멤버 메서드인 경우 public abstract 제거
	- 멤버변수인 경우 public satic final 제거
*/
interface IPersonalNumberStorage {
//	정보저장 추상 메서드
	void addPersonalInfo(String juminNum, String name);
//	정보검색 추상 메서드
	String searchPersonalInfo(String juminNum);
}

// VO(Value Object) : 값만 저장할 수 있는 객체라는 뜻, 데이터 저장용 클래스를 만들때 사용.
// DTO와 비슷한 의미로 사용됨
class PersonalInfoVO {
//	이름, 주민번호
	private String name;
	private String juminNum;
	
//	생성자 
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	
//	getter, setter : priavte 멤버를 초기화하거나 값을 반환하기 위함
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJuminNum() {
		return juminNum;
	}

	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}
}

/*
클래스가 클래스를 상속할때 -> extends
클래스가 인터페이스를 상속할때 -> implements
인터페이스가 인터페이스를 상속할때 -> extends

- extends : 상속
- implements: 구현
*/

class PersonalNumberStorageImpl implements IPersonalNumberStorage {
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	
//	생성자
	public PersonalNumberStorageImpl(int arrSize) {
//		배열 인스턴스 생성 및 입력받은 값의 크기로 초기화
		personalArr = new PersonalInfoVO[arrSize];
//		카운트용 변수 초기화
		numOfPerInfo = 0;
	}
	
//	추상메서드를 오버라이딩
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}

//	정보검색
	@Override
	public String searchPersonalInfo(String juminNum) {
//		배열에 저장된 인스턴스 개수만큼 반복
		for(int i=0 ; i<numOfPerInfo ; i++) {
//			매개변수로 전달된 주민번호를 통해 배열에서 검색
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
//				일치하는 정보가 있으면 이름 출력
				return personalArr[i].getName();
			}
		}
//		일치하는 정보가 없다면 null값 반환
		return null;
	}
	
	
}

public class E02AbstractToInterface2 {
	public static void main(String[] args) {
		
//		인스턴스 생성: 매개변수로 10전달 -> 10명의 정보저장이 가능한 인스턴스 배열 생성
		PersonalNumberStorageImpl storage = new PersonalNumberStorageImpl(10);
		
//		정보저장: 2명의 정보 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
//		정보검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
//		일치하는 정보가 없어 null 출력
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
		
	}
}
