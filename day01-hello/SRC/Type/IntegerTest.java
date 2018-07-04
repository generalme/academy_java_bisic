package Type;
/**
 * 
 * @author PC382224
 *
 */
public class IntegerTest {
	public static void main(String[] args) {
	// 선언
	// 한 줄에 변수를 선언하며 초기화 하는것을
	// 여러번 나열하는 것이 가능함
	int num1 = 5, num2 = 28;
	// 한줄에 여러 변수를 선언하는것이 가능함
	int num3,num4,num5 ;	
	
	// num3,num4,num5 에 대해서는 초기화
	// num1,num2 에 대해서는 사용
	num3 = num1 * num2;
	num4 = num2 / num1;
	num5 = 25   / num1;
	
	System.out.println("5 * 28 =" + num3);
	System.out.println("28 / 5 =" + num4);
	System.out.println("25 / 5 =" + num5);
  }
}
