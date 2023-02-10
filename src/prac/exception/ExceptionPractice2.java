package prac.exception;

import java.io.IOException;

public class ExceptionPractice2 {

	public static void readData() {
		try {
			int data = System.in.read();
			System.out.println(data);
		} catch (IOException e) {
			System.out.println("키보드 입력 에러");
		}
	}

	public static void readData2() throws IOException {
		int data = System.in.read();
		System.out.println(data);
		

	}
	
	public static void readData3() throws IOException{
		int data = System.in.read();
		System.out.println(data);
		
	}

	public static void main(String[] args) throws IOException {
		readData();
		readData2();
		readData3();
		
		Foo foo = new Foo();
		foo.doTask5();
	}

}
