package ex13interface;

import ex13interface.figure.Circle;
import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
import ex13interface.figure.Rectangle;
import ex13interface.figure.Triangle;

public class E05FigureDrawableMain {
	public static void main(String[] args) {
		
		IFigure figure = new Circle(30);
//		자식생성자로 객체생성 -> 오버라이딩 된 상태 (별도의 형변환 필요없음)
		figure.area("원");
		((Circle)figure).draw("나도 원");
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
//		IFigure에는 area만 존재 -> draw사용을 위해 다운캐스팅 필요
		((Rectangle)fig1).draw("나도 사각형");
		
		IDrawable draw = new Triangle(100, 90);
		fig1.area("삼각형");
		((Triangle)draw).draw("나도 삼각형");
		
//		자식타입 -> 다운캐스팅 없이 모든 메서드 사용가능
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("나도 원");
		
	}
}
