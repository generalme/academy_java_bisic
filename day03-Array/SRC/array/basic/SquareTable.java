package array.basic;

/**
 * 1 ~ 10까지의 정수를 원소로 가지는 배열을 사용하여 제곱표를 출력해보는 클래스
 * 
 * 출력시 foreach 활용하여 출력
 * @author PC382224
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		// 선언
		int[] numbers;
		
		// 초기화
		numbers = new int[10];
		
		// 사용
		for (int idx = 0; idx < numbers.length; idx++){
			numbers[idx] = idx + 1;
		}
		// foreach로 제곱표 출력
		for (int number : numbers){
			System.out.printf("%4d x %4d = %4d%n", number,number,number*number);
		}
	}

}
