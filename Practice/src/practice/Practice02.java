package practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 사용자에게 섭씨온도를 입력받아서 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 직접 찾아서 적용해주세요.
		 
		 화씨 온도는 소수점 첫째 자리까지 표현해주세요. 
		 # ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (℉)		
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨 온도를 입력하세요");
		System.out.print("> ");
		double sub = sc.nextDouble();
		
		System.out.printf("섭씨온도: %.1f℃\n", sub);
		System.out.printf("화씨온도: %.1f℉", (sub*9/5) + 32);
		
		sc.close();
	}

}
