package prac.exception;

/**
 * JVM에 의해 실행되는 예외 처리 메커니즘 이해
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class Foo {

	public int doTask1(int x, int y) {
		return x / y;
//		JVM은 new ArithmaticException("/by zero");

//		String name = null;
//		System.out.println(name.length());
//		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		return 0;

	}

	public int doTask2(int x, int y) {
		int result = 0;
		// 예외 처리 구문
		try {
			// 예외 발생 가능성이 있는 실행문(주로 파일 입출력, 네트워크, DB연동)
			// result = x / y;
//			String name = null;
//			name.length();
			int[] array = { 1, 2 };
			System.out.println(array[0]);
			System.out.println(array[2]);

		} catch (ArithmeticException e) {
			// 개발자가 처리하는 예외 처리 코드
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			// 디버깅용
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("객체가 생성이 안 됐는데 메소드 호출 에러");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스를 초과하였습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return result;

	}

	public int doTask3(int x, int y) {
		int result = 0;
		// 예외 처리 구문
		try {
			// 예외 발생 가능성이 있는 실행문(주로 파일 입출력, 네트워크, DB연동)
			result = x / y;
//			String name = null;
//			name.length();
//			int[] array = { 1, 2 };
//			System.out.println(array[0]);
//			System.out.println(array[2]);

		} catch (Exception e) {
//			Exception ex = new ArrayIndexOutOfBoundsException();
//			Exception ex2 = new NullPointerException();
			// 개발자가 처리하는 예외 처리 코드
			System.out.println("프로그램 실행중 예상치 못한 오류가 발생하였습니다.");
			// 디버깅용
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			// try 블록에서 예외가 발생하든 하지 않든 항상 실행되어야 하는 코드 영역
			// 입출력, 네트워크 처리에서 리소스 해제 코드들
			System.out.println("반드시 실행해야 하는 핵심 코드");
		}

		return result;

	}

	// throws를 이용한 예외 간접 처리
	public int doTask4(int x, int y) throws ArithmeticException {
		int result = 0;
		// 예외 처리 구문

		// 예외 발생 가능성이 있는 실행문(주로 파일 입출력, 네트워크, DB연동)
		result = x / y;
//			String name = null;
//			name.length();
//			int[] array = { 1, 2 };
//			System.out.println(array[0]);
//			System.out.println(array[2]);

		return result;

	}

	public void doTask5() throws NullPointerException {
		String name = null;
		name.length();
//			int[] array = { 1, 2 };
//			System.out.println(array[0]);
//			System.out.println(array[2]);
	}

}
