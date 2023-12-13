package lamda.Ex1;

//함수형 인터페이스

public class Ex1 {
	public static void main(String[] args) {
		
		//람다식으로 함수 구현
		Calc calc = (x,y) -> x + y;
		
		//인터페이스 변수로 메소드 호출
		System.out.println(calc.add(3, 5));
		
		
	}
}

@FunctionalInterface //메소드 추가를 막아줌
interface Calc{
	
	int add(int num1, int num2);
	
}
