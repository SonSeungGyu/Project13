package innerClass.Ex1;

//class 만들고 사용하기

class A {
	int num = 10;
}

class B {
	void method() {
		A a = new A();
		System.out.println(a.num);//B클래스에서 A클래스의 멤버변수 접근하기 위해선 객체를 만들어주어야 함
		

	}
}