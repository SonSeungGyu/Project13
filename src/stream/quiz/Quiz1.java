package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {
	public static void main(String[] args) {
		String[] arr = {"aaa","aaa","b","b","ccccc"};
		//배열을 스트림으로 만들어주기
		Stream<String> stream1 = Arrays.stream(arr);
		
		//문자열 목록 중에서 길이가 2보다 큰 요소의 개수
		int count = (int) stream1.filter(c -> c.length()>2).count();
		System.out.println(count);
		
		//모든 문자열의 길이를 더한 합을 구하기
		Stream<String> stream2 = Arrays.stream(arr);
		IntStream intStream = stream2.mapToInt(c -> c.length());
		System.out.println(intStream.sum());
		
		Stream<String> stream22 = Arrays.stream(arr);
		int sum = stream22.mapToInt(c -> c.length()).sum();
		System.out.println(sum);
		
		
		//가장 길이가 짧은 문자열의 길이
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.map(s -> s.length()).sorted().limit(1).forEach(s -> System.out.println(s));
		
		//다른 방식
		Stream<String> stream33 = Arrays.stream(arr);
		OptionalInt min = stream33.mapToInt(s -> s.length()).min();
		System.out.println(min.getAsInt());
		
		
		//중복을 제거한 리스트
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> strList = stream4.distinct().collect(Collectors.toList());
		
		System.out.println(strList);
		
		
	}
}
