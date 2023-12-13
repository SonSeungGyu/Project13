package lamda.quiz;

public class Quiz1 {
	public static void main(String[] args) {

		// 구현 클래스 사용
		MyNumber number1 = new MyNumberImpl();
		System.out.println(number1.max(10, 20));

		// 람다식 함수 사용
		MyNumber number2 = (x, y) -> x >= y ? x : y;
		System.out.println(number2.max(40, 30));

		// 익명클래스 사용
		MyNumber number3 = new MyNumber() {

			@Override
			public int max(int x, int y) {
				return x >= y ? x : y;
			}
		};
		System.out.println(number3.max(100, 2000));
	}
}

//함수형 인터페이스 선언
interface MyNumber {
	// 더 큰 값을 구하는 메소드 선언
	int max(int x, int y);
}

class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		int max = x >= y ? x : y;
		return max;
	}

}
