package innerClass.Ex5;

//내부클래스 종류와 제약사항

class Outer{
	
	private int a = 10;//접근제어자를 private로 지정
	private static int b = 20;
	
	class InClass{
		int i1 = a;//외부클래스의 private 멤버도 사용할 수 있음
		int i2 = b;
	}
	
	static class InSaticClass{
		int i2 = b;
	}
}
