package ex12inheritance;

/*
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의
소스를 참조하여 구현하시오.

실행결과]
직사각형 면적: 12
정사각형 면적: 49

*/

//직사각형을 표현한 클래스
class RectangleT {
//	멤버변수: 가로, 세로 길이
	int width;
	int height;
	
//	int 매개변수를 하나받는 자식 생성자에서 호출할 수 있는 기본 생성자 정의
	public RectangleT() {}
	
//	생성자 : 멤버변수 초기화
	public RectangleT(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void showAreaInfo() {
		System.out.println("직사각형 면적: " + (this.width*this.height));
	}
	
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class SquareT extends RectangleT {

//	직사각형은 가로, 세로 길이가 다르므로 2개의 멤버변수가 필요,
//	정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를 초기화할 수 있다.
	
	public SquareT(int width) {
		super(width, width);
	}
	
	@Override
	public void showAreaInfo() {
//		부모의 멤버변수를 통해 사각형의 넓이를 계산함
		System.out.println("정사각형 면적: " + (super.width*super.height));
	}
}


public class QuRectangleMainT {
	public static void main(String[] args) {
		RectangleT rec = new RectangleT(4, 3);
		rec.showAreaInfo();
		SquareT sqr = new SquareT(7);
		sqr.showAreaInfo();
		}
}
