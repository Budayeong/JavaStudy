package ex13interface;

//프로젝트 전체에서 기준 역할을 하는 추상 클래스
abstract class PersonalNumberStorageAbs {
//	정보저장 추상 메서드
	public abstract void addPersonalInfo(String juminNum, String name);
//	정보검색 추상 메서드
	public abstract String searchPersonalInfo(String juminNum);
}

//DTO(Data Transfer Object) : 데이터를 저장하고 전송하기 위한 용도의 객체 = VO(Value Object)로 표현하기도 함
class PersonalInfoDTO {
//	이름, 주민번호
	private String name;
	private String juminNum;
	
//	생성자 
	public PersonalInfoDTO(String name, String juminNum) {
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

//추상클래스를 상속해 정보저장, 검색 기능 구현
class PersonalNumberStorageExt extends PersonalNumberStorageAbs {
//	2명 이상의 정보를 저장해야하므로 DTO 타입의 배열 선언
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	
//	생성자
	public PersonalNumberStorageExt(int arrSize) {
//		배열 인스턴스 생성 및 입력받은 값의 크기로 초기화
		personalArr = new PersonalInfoDTO[arrSize];
//		카운트용 변수 초기화
		numOfPerInfo = 0;
	}
	
//	추상메서드를 오버라이딩
	@Override
	public void addPersonalInfo(String juminNum, String name) {
//		주민번호와 이름을 매개변수로 받은 후 DTO인스턴스 배열에 추가
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, juminNum);
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

public class E02AbstractToInterface1 {
	public static void main(String[] args) {
		
//		인스턴스 생성: 매개변수로 10전달 -> 10명의 정보저장이 가능한 인스턴스 배열 생성
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
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
