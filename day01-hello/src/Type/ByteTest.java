package Type;
/**
 * 1byte 에 해당하는 크기만틈
 * 정수를 저장하는 타입인
 * byte 타입을 테스트 하는 클래스이다.
 * 
 * 1byte = 8bit
 * @author PC382224
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 선언
		byte buffer;
		
		// 초기화
		buffer = 0;
		
		// 사용
		for (int idx = 0; idx < 257; idx++) {
			System.out.print(buffer++);
			System.out.println(",");			
		}
		// 저장할수있는 값의 범위를 넘어서는 값을
		// 직접 할당하는 것은 불가능
//		buffer = 128; --> 오류코드 

	}

}
