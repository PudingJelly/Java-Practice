package practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {

		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서 평균을 구해보세요.
		 유효하지 않은 점수라면 사용자에게 다시 입력하게끔 유도하세요.(100점 만점)
		 평균이 90점을 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 94 ~ 90 -> A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는 모두 F 처리하시면 됩니다. 

		 출력은 아래 예시와 같이 진행해주세요.
		 
		 ex)
		 평균 점수 : 95.5
		 당신의 학점은 'A+'입니다.		 
		 */
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		while(true) {
			boolean flag = false;
			System.out.print("국어: ");
			kor = sc.nextInt();
			if(kor<0 || 100>kor) {
				System.out.println("점수를 다시 입력하세요");
				flag = true;
			}
			if(!flag)
			System.out.print("영어: ");
			eng = sc.nextInt();
			System.out.print("수학: ");
			math = sc.nextInt();
		}
	}

}
