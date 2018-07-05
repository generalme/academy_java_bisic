package operator.temary;

import java.util.Scanner;

/**
 * 삼항연산자(조건식 ? 값1 : 값2)를
 * 테스트 하는 클래스이다.
 * -----------------------------------------
 * 조건식 : 연산 결과는 항상 boolean 타입의 데이터로 나와야한다.
 * 값1 : 조건식의 결과가 true일때 선택되는 값
 * 값2 : 조건식의 결과가 false 일때 선택되는 값
 * -----------------------------------------
 * 값1,값2의 데이터 타입이 일치해야한다.
 * 
 * 수학적 절댓값 계산을 사용하여 테스트 해본다.
 * @author PC382224
 *
 */
public class TernaryTest {

	public static void main(String[] args) {
		// 선언
		int x = 10;
		int y = -10;
		
		// x,y 변수에 들어있는 값의 절댓값을 저장할 변수
		int absX = (x < 0) ? -x : x;
		int absY = (y < 0) ? -y : y;		
		
		// 사용
		System.out.printf("x =%d 일 때 , x의 절댓값은 %d%n",x,absX);
		System.out.printf("y =%d 일 때 , y의 절댓값은 %d%n",y,absY);
		
		// 스캐너를 사용하여 입력받은 값의 절댓값을 구해보자
		// 1. 스캐너, 새 변수 선언
		Scanner scan;
		int z;
		
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		z = scan.nextInt();
		
		int absZ = (z < 0) ? -z : z;
		
		System.out.printf("z = %d 일때, z의 절댓값은 %d%n",z,absZ );
	}

}
