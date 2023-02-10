package prac.exception;

/**
 * 자바에서 예외란?
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class ExceptionPractice {

	public static void main(String[] args) {
		Foo foo = new Foo();
		
		foo.doTask2(4, 0);
	}

}
