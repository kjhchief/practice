package prac.array;

/**
 * 다차원 배열 선언, 생성, 사용하기
 * 
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExamplePrac5 {

	public static void main(String[] args) {
		int[][] array = {{11,22,33,44,55}, {23, 45, 56, 77, 99}};
		
		for(int i =0; i < array.length; i++) {
			System.out.println((i+1)+"반 성적");
			for(int j=0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}