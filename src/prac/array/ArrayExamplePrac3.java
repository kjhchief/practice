package prac.array;

/**
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExamplePrac3 {

	public static void main(String[] args) {
		int[] array = { 99, 78, 90, 100, 75 };
		int[] copyArray1= ArrayUtilPrac.copyArray(array, 5);
		for (int i = 0; i < copyArray1.length; i++) {
			System.out.print(copyArray1[i]+ " ");
		}
		
		System.out.println("\n");
		
		array = ArrayUtilPrac.sort(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}