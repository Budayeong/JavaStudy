package ex16ExceptionsBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외처리 시 필요에 따라 여러개의 catch블럭 사용 가능
     - 이러한 경우 범위가 작은 클래스를 먼저 써야함
	 - Exception 클래스는 모든 예외를 catch할 수 있기 때문
*/

public class Ex04MultiCatch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		
		try {
			for(int i=0 ; i<array.length ; i++) {
				System.out.println("array[" + i + "]에 저장할 숫자입력: ");
//				입력한 문자열을 정수로 변경한 후 배열에 저장 -> 숫자가 아닌 문자열이 들어올 수 있음 (예외발생)
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			
//			1번 인덱스에 0을 넣었으면 연산 불가 (예외발생)
			System.out.println("배열에 저장된 두 숫자 나누기: " + array[0]/array[1]);
			
			System.out.println("나이를 입력하세요: ");
//			nextInt()는 정수값만 받을 수 있음 -> 정수 외의 값이 들어오면 (예외발생)
			int age = scanner.nextInt();
			System.out.println("당신의 나이는: " + age);
			
//			배열의 크기가 3이므로 인덱스는 2까지 존재 -> 3번 인덱스는 존재하지않음 (예외발생)
			array[3] = age;
		}
		catch (InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다");
		}
		catch (ArithmeticException e) {
			System.out.println("산술연산이 불가능 합니다");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력가능합니다");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다");
		}		
		catch (Exception e) {
//			Exception 클래스는 모든 예외클래스의 부모(모든 예외를 다 catch 가능) -> catch절의 마지막에 기술해야함 
			System.out.println("예외가 발생하였습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		앞에서 예외가 발생하더라도 예외처리를 했으므로 프로그램이 마지막까지 정상 실행됨 (-> 예외처리의 목적)
		System.out.println("=== 프로그램 끝 ===");
		
		
	}
}
