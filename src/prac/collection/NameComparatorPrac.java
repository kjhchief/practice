package prac.collection;

import java.util.Comparator;

public class NameComparatorPrac implements Comparator<StudentPrac> {

	@Override
	public int compare(StudentPrac s1, StudentPrac s2) {
		
		return s1.name.compareTo(s2.name);
	}

}
