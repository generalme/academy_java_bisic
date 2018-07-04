package operator.binary;

/**
 * 관계연산자를 테스트하는 클래스이다.(대소비교,등가비교 연산자)
 * 대소비교 : >,<,>=,<=
 * 등가비교 : == , !=
 * 
 * 관계 연산의 결과는 boolean 타입으로 얻어짐
 * @author PC382224
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 선언 , 초기화
		int a = 1;
		int b = -5;
		
		// 사용
		System.out.printf("(%d == %d : %b%n" ,a,b,(a ==b));
		System.out.printf("(%d != %d : %b%n" ,a,b,(a !=b));
		
		System.out.printf("(%d > %d : %b%n" ,a,b,(a >b));
		System.out.printf("(%d < %d : %b%n" ,a,b,(a <b));
		System.out.printf("(%d >= %d : %b%n" ,a,b,(a >=b));
		System.out.printf("(%d <= %d : %b%n" ,a,b,(a <=b));
		
		/*
		 *   printf() 메소드에서 사용하는 포맷 스트링의 종류
		 *   
		 *   %d : decimal 의 약자,정수 표기
		 *   %f : float 의 약자 , 실수 표기
		 *   %b : boolean 값 표기 , boolean 약자
		 *   %s : string 의 약자 , 문자열 표기
		 *   %x : hexa의 약자 , 16진수 표기
		 *   
		 *   %% : %기호 자체를 출력
		 *   %n : new-line, 엔터키 입력과 같은 효과
		 */
		
		// 라인 카피 : ctrl + alt + up/down
		// 라인 이동 : alt + up/down
		// 세로 편집 모드 진입 : alt + shift + a
	}

}
