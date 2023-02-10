package prac.collection;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	static String name = "김재훈천재";
	
	public static void main(String[] args) {
		int num = 12;
		
		Calendar today = Calendar.getInstance();
		double dou = 2.2;
		
		Set<Object> set = new HashSet<>();
		set.add(name);
		set.add("우후죽순순");
		set.add(num);
		set.add(today);
		set.add(dou);
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
			Object n = iter.next();
			System.out.println(n);
		}
		
		int count = set.size();
		System.out.println(count);
		
		
		
		
		
	}
	
	
	

	
}
