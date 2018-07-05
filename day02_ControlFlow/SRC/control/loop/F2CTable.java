package control.loop;

/**
 * 화씨온도(F) -> 섭씨온도(C)로 변환
 * 변환 공식 : C = 5/9*(F-32)
 * 
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도까지 계산
 * 화씨온도 변수 : fah
 * 섭씨온도 변수 : cel
 * 
 * for 구문구조 사용
 * 출력형태는 printf사용
 * @author PC382224
 *
 */
public class F2CTable {

	public static void main(String[] args) {		
		double cel ;
		
		for (double fah = 0; fah <= 100.0; fah += 10) {
			cel = 5.0 / 9 * (fah-32);	
			System.out.printf("%5.1f F,  %5.1f C%n", fah,cel);
		}
	}

}
