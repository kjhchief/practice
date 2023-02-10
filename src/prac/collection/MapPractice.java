package prac.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "김재훈");
		map.put(2, "전미경");
		map.put(3, "정재훈");
		map.put(4, "유승현");

		for (int i = 4; i < 4000; i++) {
			map.put(i, "복제인간 " + (i+1) + "호");
		}
		System.out.println(map.size());

//		String name = map.get(3);
//		System.out.println(name);

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer number = iter.next();
//			System.out.println(number);
		}
		
		Collection<String> values = map.values();
		Iterator<String> iter2 = values.iterator();
		while (iter2.hasNext()) {
			String names = iter2.next();
//			System.out.println(names);
			
		}
		
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iter3 = set.iterator();
		while(iter3.hasNext()) {
			Entry<Integer, String> entry = iter3.next();
			System.out.println(entry);
			entry.getKey();
			entry.getValue();
		}
		
		

	}

}
