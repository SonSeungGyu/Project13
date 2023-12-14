package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림의 연산 - 최종연산

public class Ex4 {
	public static void main(String[] args) {
		
		//배열선언
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		//배열에서 기본형 스트림 생성
		IntStream stream1 = Arrays.stream(intArr);
		
		//지정된 반복 작업을 수행
		stream1.forEach(n -> System.out.println(n));
		
		
		System.out.println("스트림 요소의 개수 구하기");
		//스트림 요소의 개수 구하기
		IntStream stream2 = Arrays.stream(intArr);
		System.out.println(stream2.count());
		
		System.out.println("스트림 요소의 합 구하기");
		//스트림 요소의 합 구하기
		IntStream stream3 = Arrays.stream(intArr);
		System.out.println(stream3.sum());//기본형 스트림에선 불가능
		
		//초기값을 넣고, 반복 작업 수행
		IntStream stream4 = Arrays.stream(intArr);
		int result = stream4.reduce(10, (total, n) -> total + n);
		System.out.println(result);
		
		//리스트 생성
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//스트림을 set으로 변경
		Stream <Integer> stream5 = list.stream();
		Set<Integer> set = stream5.collect(Collectors.toSet());
		System.out.println(set);
		
		//스트림을 list로 변경
		Stream<Integer> stream6 = list.stream();
		List<Integer> strList = stream6.collect(Collectors.toList());
		System.out.println(strList);
	
	}
}
