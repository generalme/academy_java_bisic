package Type;
/**
 * 문자 1개를 저장하는 타입 : char
 * 
 * 내부적으로 숫자로 저장하는 특징이 있다.
 * @author PC382224
 *
 */
public class CharTest {

	public static void main(String[] args) {
		// 선언		
		char input;
		// 초기화
		input = 'a';
		// 사용
		System.out.println("input =" + input);
		
		// char 가 내부적으로 숫자로 저장되는 것 확인
		int  code = input;
		System.out.println("code =" + code);
		
		System.out.println("(char)code =" + (char)code);
		
	}

}
