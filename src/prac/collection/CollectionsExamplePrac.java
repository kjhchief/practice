package prac.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 콜렉션과 관련된 공통 메소드를 제공하는 유틸리티 클래스
 * @Author 김재훈
 * @Date 2023. 1. 25.
 */
public class CollectionsExamplePrac {

	public static void main(String[] args) {

		List<StudentPrac> list3 = new ArrayList<>();
		list3.add(new StudentPrac("경희", 20, 100));
		list3.add(new StudentPrac("남희", 30, 85));
		list3.add(new StudentPrac("Jack", 10, 70));
		//StudentPrac 클래스를 sort로 정렬하기
		
		
		
		Collections.sort(list3, new NameComparatorPrac());
		System.out.println(list3.toString());

	}

}
