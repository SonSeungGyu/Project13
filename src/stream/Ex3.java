package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
	public static void main(String[] args) {
		
		//리스트 생성
		List<Integer> list = Arrays.asList(1,1,2,3,5,4);
		
		//리스트로부터 스트림 생성
		Stream<Integer> stream1 = list.stream();
		
		//중간연산으로 중복을 제거하고 출력
//		stream1.distinct().forEach(n -> System.out.print(n + " "));
		
		
		
		Stream<Integer> stream2 = list.stream();
		
		//중간연산으로 2의 배수만 추출하고, 최종연산으로 요소를 하나씩 출력
		//stream2.filter(n->n%2==0).forEach(n -> System.out.print(n + " "));
		
		
		Stream<Integer> stream3 = list.stream();
		//stream3.limit(3).forEach(n -> System.out.print(n + " "));
		
		//중간연산으로 순서대로 정렬하고 출력
		Stream<Integer> stream4 = list.stream();
//		stream4.sorted().forEach(n -> System.out.print(n + " "));
		
		//중간연산으로 역순으로 정렬하고 출력
		Stream<Integer> stream5 = list.stream();
//		stream4.sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
		
		
		//Stream<Integer>을 기본형 스트림 IntStream 으로 변경
		Stream<Integer> stream6 = list.stream();
		IntStream intStream = stream6.mapToInt(n -> n.intValue());
		
		//System.out.println(intStream.sum());
		
		//Stream은  sum, max 같은 함수를 사용할 수 없음
		
		
		//리스트 생성
		List<String> strList = Arrays.asList("aaa","bbb","ccc");
		
		//중간연산으로 요소를 대문자로 변경하고 출력
		Stream<String> stream7 = strList.stream();
		//stream7.map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
		
		
		//중간연산으로 문자열의 길이로 변경하고 출력
		Stream<String> stream8 = strList.stream();
		
		stream8.map(s -> {
			int length = s.length();
			return length;
		}).forEach(s -> System.out.print(s + " "));
		
	}
}
