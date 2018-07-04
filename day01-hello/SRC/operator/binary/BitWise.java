package operator.binary;

/**
 * 비트연산을 수행하는 이항연산자를 테스트하는 클래스
 * &,|,^
 * @author PC382224
 *
 */
		
public class BitWise {

	public static void main(String[] args) {
		// 변수 선언
		// 0x로 시작하면 16진수로 숫자값을 표기함
		// 0~9 , a~f 로 값을 표기하는 방식
		int a = 0x1f05;
		int b = 0x31a1;
		
		// 사용 : 두 변수 값을 비트 연산 수행
		System.out.printf("%x & %x = %x%n" , a,b, a & b);
		System.out.printf("%x | %x = %x%n" , a,b, a	| b);
		System.out.printf("%x ^ %x = %x%n" , a,b, a ^ b);
		System.out.printf("~%x  = %x%n" , a, ~a );
		
	}

}
