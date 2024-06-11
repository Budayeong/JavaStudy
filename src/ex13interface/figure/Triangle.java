package ex13interface.figure;

//삼각형 표현 클래스
public class Triangle extends FigureData implements IFigure, IDrawable {

	public Triangle(int widht, int height) {
		super(widht, height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그려봅니다");
	}

	
	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적은(밑변*높이*0.5): "+(width*height
				*0.5));
	}
	
	
	
}
