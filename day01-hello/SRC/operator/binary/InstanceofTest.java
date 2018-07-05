package operator.binary;
/**
 * 객체의 타입을 조사하는 연산자
 * instanceof 를 테스트 하는 클래스
 * 
 * object instanceof class
 * 로 사용시 object 가 class 타입의 객체이면 true 
 * 그 외의 경우는 false 를 결과로 얻어내는 연산자
 * @author PC382224
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		// 선언
		String name = "정준호";
		boolean result;
		
		// 사용
		result = (name instanceof String);
		System.out.printf("name = %s 이며%n %s(은)는 String 타입이다? %b%n", name, name, result);
		
		// 선언 : StringBuffer => 문자열을 저장할 수 있는 String과 유사하지만 다른 타입
		StringBuffer surname;
		
		// 초기화
		surname = new StringBuffer("jeong");
		
		// 사용
		result = ((Object)surname instanceof String);
		System.out.printf("surname = %s 이며%n %s(은)는 String 타입이다? %b%n", surname, surname, result);
	}

}
