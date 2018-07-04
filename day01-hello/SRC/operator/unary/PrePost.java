package operator.unary;

/**
 * 단항연산자 : 증감연산자(++,--)를 테스트 하는 클래스
 * 증감연산자의 위치에 따른 값의 변화를 확인
 * ---------------------------------------
 * 변수 앞에 쓰이면 증가된 값이 결과로 사용되며
 * 변수 뒤에 쓰이면 증가되기 전의 값이 결과로 사용됨.
 * @author PC382224
 *
 */
public class PrePost {

	public static void main(String[] args) {
		// 선언, 초기화
		int count = 0;
		// 사용
		System.out.println(++count);
		System.out.println(count++);
		System.out.println(--count);
		System.out.println(count--);
		
		System.out.printf("변경값","변경후값");
		System.out.println(++count + "," + count);
		System.out.println(count++ + "," + count);
		System.out.println(--count + "," + count);
		System.out.println(count-- + "," + count);
		
	}

}
