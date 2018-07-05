package control.swtchstmt;

import java.util.Scanner;

/**
 * 90점 이상 a
 * 80 ~ 89 b
 * 60 ~ 79 c
 * 40 ~ 59 d
 * 나머지 f
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 출력시 printf사용
 * @author PC382224
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.printf("점수를 입력해 주세요.");
		score = scan.nextInt();
		
		switch(score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 6: case 7:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
			
			default :
				grade = 'F';
		
		
		} // end switch
		
		System.out.printf("점수 : %d, 학점 : %c ", score, grade);
	}

}
