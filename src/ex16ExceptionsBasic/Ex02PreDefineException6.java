package ex16ExceptionsBasic;

public class Ex02PreDefineException6 {
	 
	public static void main(String[] args)  {	
  
		Object object = new Object();
		try {
//			최상위 클래스인 Object 생성자로 객체 생성 -> 당연히 자식타입으로 형변환 불가 => 예외발생
			String strObject = (String)object;
		}
		catch(ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==ClassCastException발생후==");
			
		System.out.println("끝~~~");
		
		String str = "형변환되나요?";
		boolean castFlag = myClassCasting(str);
		if(castFlag==true)
			System.out.println("됩니다요..");
		else
			System.out.println("안되네요..ㅜㅜ;");
				 
	}////end of main	
	
	/*
	String 인스턴스가 전달 -> myClassCasting에서 Object 타입으로 업캐스팅되어 받음 -> 
	원래 String 타입 인스턴스이므로 당연히 String으로 다운캐스팅 가능
	*/
	public static boolean myClassCasting(Object o) {
		if(o instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}
}


