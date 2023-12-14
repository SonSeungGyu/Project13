package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {
	public static void main(String[] args) {
		String[] arr = {"file1.txt", "file2.pdf","file3.txt","file4.img","file5.txt","file6.img"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		stream1
			.filter(s -> s.endsWith("txt"))//filter의 내부에서는 조건을 주는것
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr);
		long count1 = stream2.filter(s -> s.endsWith("txt")).count();
		System.out.println("txt 파일의 개수: " + count1);
		System.out.println();
		
		Stream<String> stream3 = Arrays.stream(arr);
		stream3
			.map(s -> s.substring(s.indexOf(".")+1))
			.distinct()
			.forEach(s -> System.out.println(s));
		
		//split을 이용한 문자열 자르기
		Stream<String> stream4 = Arrays.stream(arr);
		stream4
			.map(s ->{//map 안에는 데이터를 가공하고, 코드가 한 줄 이상이면 중괄호 안에 코드를 작성.
				//.을 구분자로 사용하여 문자열을 자름
				String[] strArr = s.split("\\.");
				return strArr[1];
						
			})
			.distinct()
			.forEach(s -> System.out.println(s + " "));
		
		
	}
}
