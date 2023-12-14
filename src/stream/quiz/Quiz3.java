package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001,2022,300));
		list.add(new Order(1002,2022,150));
		list.add(new Order(1003,2022,200));
		list.add(new Order(1004,2023,500));
		list.add(new Order(1005,2023,400));
		list.add(new Order(1006,2023,600));
		list.add(new Order(1007,2023,650));
		
		
		Stream<Order> str1 = list.stream();
		str1
			.map(s -> s.orderNo)
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println();
		
		
		Stream<Order> str2 = list.stream();
		int sum = str2
					.filter(s -> s.year == 2022)
					.mapToInt(s -> s.price)
					.sum();
		System.out.print("2022년도 거래 총금액: " + sum + ", ");
		
		Stream<Order> str22 = list.stream();
		long count = str22
						.filter(s -> s.year == 2022)
						.count();
		System.out.println("거래 건수: " + count);
		
		System.out.println();
		
		Stream<Order> str3 = list.stream();
		int sum1 = str3
					.filter(s -> s.year == 2023)
					.mapToInt(s -> s.price)
					.sum();
		System.out.print("2023년도 거래 총금액: " + sum1 + ", ");
		
		Stream<Order> str33 = list.stream();
		long count1 = str33
						.filter(s -> s.year == 2023)
						.count();
		System.out.println("거래 건수: " + count1);
		
	
		
		
		
		
	}
}


class Order{
	int orderNo;
	int year;
	int price;
	
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}
	

	
	
}
