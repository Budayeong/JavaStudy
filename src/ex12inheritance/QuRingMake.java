package ex12inheritance;

/*
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 해당 문제는 상속(Inheritance)을 통해
구현하는것이 아니라 구성(Composition)관계를 이용하여 해결한다. Point 클래스를 기반으로 원을
의미하는 Circle클래스를 정의하자. 그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

문제설명]
그래프 상에 원을 표현하기 위해선 중심점과 반지름이 필요하다.
링을 표현하기 위해선 원 2개가 필요하다.

실행결과]
안쪽원의 정보 :
반지름 : 3
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]

*/

class Point {
	int xDot, yDot;
	public Point(int x, int y) {
		xDot=x;
		yDot=y;
	}
	
	public void showPointInfo() {
		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
		}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle {
	int radian; //반지름
	Point center;
	
	public Circle(int x, int y, int radian) {
		center = new Point(x, y);
		this.radian = radian;
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring {
	Circle innerCircle; //안쪽의 원
	Circle outerCircle; //바깥쪽의 원
	
	public Ring(int ix, int iy, int iradian, int ox, int oy, int oradian) {
		innerCircle = new Circle(ix, iy, iradian);
		outerCircle = new Circle(ox, oy, oradian);
	}
	
	public void showRingInfo() {
		System.out.println("안쪽원의 정보: ");
		System.out.println("반지름: " + innerCircle.radian);
		innerCircle.center.showPointInfo();
		System.out.println("바깥쪽원의 정보: ");
		System.out.println("반지름: " + outerCircle.radian);
		outerCircle.center.showPointInfo();
	}
	
}

public class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
