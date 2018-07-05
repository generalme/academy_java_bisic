package control.loop;

/**
 * for 반복구조에서 선언식, 조건식, 증감식이 생략된 구문을 무한 반복 테스트
 * 해보는 클래스
 * @author PC382224
 *
 */
public class InfiniteFor {

	public static void main(String[] args) {
		for(int idx = 0;;idx++) {
			System.out.printf("idx = %d%n", idx);
		}
	}

}
