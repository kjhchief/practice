package prac.array;

/**
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExamplePrac4 {

	public static void main(String[] args) {
		// 6개의 로또번호 임의 생성 및 배열에 저장
		int[] lottos = new int[6];
		for (int i=0; i < lottos.length; i++) {
			int random1 = (int)(Math.random() *45)+1;
			lottos[i] = random1;
			// 중복 확인
			for(int j=0; j<i; j++) {
				if(lottos[j] == lottos[i]) {
					i--;
				}
			}
		}
		
		// 출력 + 정렬
		ArrayUtilPrac.sort(lottos);
		
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(" "+lottos[i]);
			
		}
		

	}

}