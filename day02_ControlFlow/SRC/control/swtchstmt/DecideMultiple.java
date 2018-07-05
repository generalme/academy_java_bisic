package control.swtchstmt;

import java.util.Scanner;

/**
 * 입력된 자연수가 3의 배수인지
 * 판별하는 클래스
 * 
 * 배수 판단에 switch 구문을 사용
 * @author PC382224
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
		// 선언
		// 입력받을 값을 저장할 변수 선언
		int input;
		// 초기화
		Scanner scan;
		scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 input 변수 초기화
		System.out.println("자연수를 입력하세요.");
		input = scan.nextInt();
		
		// 사용
		switch(input % 3) {
		case 0 :
			System.out.printf("입력 값 %d 는 3의 배수입니다. %n", input);
			break;
		case 1 : 
		case 2 :	
			System.out.printf("입력 값 %d 는 3의 배수가 아닙니다. %n", input);
			break;
		/*case 2 :	
			System.out.printf("입력 값 %d 는 3의 배수가 아닙니다. %n", input);
			break;*/
		} // end switch
		
	} // end main

} // end class
