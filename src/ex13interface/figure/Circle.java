package ex13interface.figure;

//원은 반지름만 있으면 넓이를 구할 수 있음 -> FigureDta 상속 X
public class Circle implements IFigure, IDrawable{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
//	메서드가 각각 하나씩 있는 인터페이스를 두개 상속받았기때문에 두번의 오버라이딩 필요
	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다");
	}
	@Override
	public void area(String figureName) {
//		Math.PI: Math클래스 static 상수로 원주율 사용
		System.out.println(figureName + "의 면적(r*r*PI):" + radius*radius*Math.PI);
	}
	
	
}
