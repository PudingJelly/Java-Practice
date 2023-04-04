package practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {

		/*
		 키와 나이를 입력받아서 사용자가 놀이기구에 탑승할 수 있는지의 여부를 판단하시면 됩니다.
		 키 140cm 이상, 190cm 이하이며 나이가 8세 이상, 70세 미만인 사용자만 탑승이 가능합니다.

		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!"를 출력하세요.
		 */


		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double tall = sc.nextDouble();

		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		if(tall>=140 && tall<=190 && age>=8 && age<70) {
			System.out.println("탑승 가능합니다");
		} 
		else System.out.println("탑승이 불가능합니다");
		System.out.println("오늘 하루 즐거운 시간 되세요");
		
		sc.close();
	}

}
