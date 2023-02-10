package prac.collection;

//Collections.sort() 메소드를 이용하여 정렬 가능하기 위해 Comparable 인터페이스 구현.
public class StudentPrac implements Comparable<StudentPrac> {
	String name;
	int no;
	int score;

	public StudentPrac() {
	}

	public StudentPrac(String name, int no, int score) {
		this.name = name;
		this.no = no;
		this.score = score;
	}

	// 오버로딩은 타입 안에 하는구나.
	@Override
	public String toString() {
		return "<" + name + ", " + no + ", " + score + ">";
	}

	// Student 객체 정렬 기준은 학번이다. Comparable 안의 compareTo 메소드 재정의.
	@Override
	public int compareTo(StudentPrac s) {
//		if(this.score > s.score) {
//		return 1;
//		}else if(this.no == s.no) {
//		return 0;
//		}else {
//		return -1;
//		}

		// 이거 한줄로 대체 가능
		return this.score - s.score;

	}
	
}