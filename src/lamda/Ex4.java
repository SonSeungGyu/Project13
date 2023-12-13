package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//람다식 함수 활용하기(2)

public class Ex4 {
	public static void main(String[] args) {

		// 문자열 리스트 생성
		List<String> list = new ArrayList<>();

		// 문자열 추가
		list.add("add");
		list.add("ccc");
		list.add("bbb");

		// 리스트를 순서대로 정렬하기
		// Collection.sort(): 리스트의 데이터를 순서대로 정렬
		// 인자: 문자열 리스트, 리스트 정렬하는 로직을 가지고 있는 Comparator 클래스를 넣어준다
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//
//		System.out.println("리스트 순정렬: " + list);

		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println("리스트 순정렬: " + list);

	}
}
