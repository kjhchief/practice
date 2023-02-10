package prac.array;

/**
 * 배열과 관련된 공통 기능 정의
 * 
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayUtilPrac {
	public static int[] copyArray(int[] srcArray, int increament) {
		int[] copiedArray = new int[srcArray.length + increament];
		for (int i = 0; i < srcArray.length; i++) {
			copiedArray[i] = srcArray[i];
		}
		return copiedArray;
	}

	public static int[] sort(int[] srcArray) {
		for (int i = 0; i < srcArray.length; i++) {
			for (int j = 0; j < srcArray.length - 1; j++) {
				int save;
				if (srcArray[i] > srcArray[j + 1]) {
					save = srcArray[j];
					srcArray[j] = srcArray[j + 1];
					srcArray[j + 1] = save;
				}
			}
		}

		return srcArray;
	}

}
