package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Ex5 {
	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<>();

		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println(customerList);

		// 고객의 명단
		Stream<Customer> stream1 = customerList.stream();
		// stream1.forEach(a -> System.out.println(a));

		// map은 각 객체의 속성에 접근하고 싶을때 이용, 데이터를 변환 하여 새로운 스트림을 생성하고 그 스트림을 사용해서 하나씩 출력한 것
		stream1.map(c -> c.name).forEach(a -> System.out.println(a));
		
		//모든 고객의 총 에산
		Stream<Customer> stream2 = customerList.stream();
		IntStream intStream = stream2.mapToInt(c -> c.budget);
		System.out.println(intStream.sum());
		
		//20세 이상 고객 명단
		Stream<Customer> stream3 = customerList.stream();
		stream3.filter(s -> s.age >= 20).map(s -> s.name).sorted().forEach(s -> System.out.println(s));
		

	}
}

//고객 클래스
class Customer {
	String name;
	int age;
	int budget;

	// 생성자
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}

}