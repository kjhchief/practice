package prac.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 일상생활의 책꽂이처럼 순서가 있고, 데이터 중복을 허용하는 데이터 구조 Collection을 상속받은 List 인터페이스 Set인터페이스를
 * 구현한 대표적 클래스: ArrayList, Vector
 * 
 * @Author 김재훈
 * @Date 2023. 1. 19.
 */
public class ListExamplePrac {
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정";
		
		List<Object> list = new ArrayList<>();
		
		boolean ok = list.add(name);
		ok = list.add("김재훈");
//		System.out.println(ok);
		
		list.add(in);
		list.add(today);
		list.add(random);
		list.add(name2);
		
		// 전체 목록 조회
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------------");
		
		Object obj = list.remove(2);
		
		for (Object obj2 : list) {
			System.out.println(obj2);
		}
		
	}

}
