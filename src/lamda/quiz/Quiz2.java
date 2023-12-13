package lamda.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		
		//익명클래스 사용
		Hello hello = new Hello() {
			@Override
			public void helloPrint() {
				System.out.println("익명클래스");
			}
		};
		hello.helloPrint();
		
		//람다식 함수 사용
		Hello hello1 = () -> System.out.println("람다식");
		hello1.helloPrint();
		
		//구현클래스 사용
		Hello hello2 = new HelloImpl();
		hello2.helloPrint();
		
	
	}
}

//함수형 인터페이스 선언
interface Hello {
	void helloPrint(); // 추상메소드 선언
}

//구현 클래스
class HelloImpl implements Hello{

	@Override
	public void helloPrint() {
		System.out.println("구현클래스");
	}
	
}