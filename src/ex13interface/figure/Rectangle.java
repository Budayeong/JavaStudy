package ex13interface.figure;

//사각형 표현 클래스 - 가로/세로 길이가 필요하므로 FigureData 상속, 넓이계산 및 그리기 를 위해 2개의 인터페이스 구현
public class Rectangle extends FigureData implements IFigure, IDrawable {
	
//	상속은 '확장'이 기본이지만 특수한 경우에는 멤버의 확장이 필요하지않음. 
	public Rectangle(int widht, int height) {
		super(widht, height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적(가로*세로):" + width*height);
	}

}
