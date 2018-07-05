package control.loop;

public class SumOfEvent {

	public static void main(String[] args) {
		// 선언, 초기화
		int number = 0;
		int sum = 0;
		
		// 사용
		while (number <= 100) {
			if((number % 2) == 0) {
			sum += number;
			}
			number += 2;
		}
		System.out.printf("1~100 사이의 짝수의 합 : %d%n", sum);
	}

}
