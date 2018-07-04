package operator.binary;

import java.util.Scanner;

/**
 * 입력된 점수가 0 ~ 100 사이의 유효한 값인지
 * 판단하는 클래스
 * 
 * 논리연산자 && 를 테스트한다.
 * 
 * scanner 를 사용하여 간단히 키보드 입력으로 처리한다
 * @author PC382224
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		// 선언
		// 스캐너 선언
		Scanner scan;
		
		//변수 선언
		int score;
		
		scan = new Scanner(System.in);
		System.out.println("점수를 입력 : ");
		score = scan.nextInt();
		
		// 0 <= score <= 100
		if(score >=0 && score <= 100) {
			 System.out.printf("%d는 유효한 점수입니다.", score);
			 
		} else {System.out.printf("%d는 유효한 점수가 아닙니다.%n", score);
		    }
		/*
		 *  테스트 진행시 주의 점
		 *  올바른 데이터 만으로 테스트 하는것
		 *  경계값 테스트를 반드시 진행
		 *  잘못된 결과를 발생시킬 것으로 예상되는 값으로 반드시 진행
		 */
		}
	}


