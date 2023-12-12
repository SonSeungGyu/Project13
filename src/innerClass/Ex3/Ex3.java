package innerClass.Ex3;

public class Ex3 {
	public static void main(String[] args) {

		// 인스턴스 내부 클래스의 인스턴스 생성
		Outer outer = new Outer();

		Outer.InstanseInner instanseInner = outer.new InstanseInner();
		instanseInner.i1 = 300; // 인스턴스 변수 사용
		instanseInner.i2 = 300; // 정적 변수 사용

		Outer outer2 = new Outer();

		Outer.InstanseInner instanseInner2 = outer2.new InstanseInner();
		instanseInner2.i1 = 400; // 인스턴스 변수 사용
		instanseInner2.i2 = 400; // 정적 변수 사용
		
		System.out.println(instanseInner.i1 + " ," + instanseInner.i2);
		System.out.println(instanseInner2.i1 + " ," + instanseInner2.i2);
		
		
		//정적 내부 클래스의 인스턴스 생성
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.i1 = 300;
		staticInner.i2 = 300;
	}
}

class Outer {

	// 인스턴스 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있다.
	class InstanseInner {
		int i1 = 100;
		// 단, 외부 객체없이는 사용할 수 없기때문에 정적변수는 외부 객체에 종속된다.
		static int i2 = 200;
	}

	// 정적 클래스는 인스턴스변수와 정적변수 모두 가질 수 있음.
	static class StaticInner {
		int i1 = 100;
		static int i2 = 200;

	}

}
