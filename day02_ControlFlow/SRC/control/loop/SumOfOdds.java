package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * 
 * while구문을 활용
 * @author PC382224
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
       // 선언
	   // 1~100까지 증가시킬 값을 저장하는 변수 선언
		int number = 1;
		int sum = 0;	   
		
	   // 사용
		while (number <= 100) {
//          sum = sum + number ;
//			if((number % 2) == 1){}
			sum += number;
			number += 2; // ++연산자는 무조건 1씩 증가
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 : %d%n", sum);
		
	}

}
