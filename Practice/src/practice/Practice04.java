package practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {

		/*
		 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰지 혹은 같은지를 판별하시면 됩니다.
		 
		 ex)
		 입력받은 수 : 4, 7 -> 7이 큰 수입니다.
		 입력받은 수 : 10, 3 -> 10이 큰 수입니다.
		 입력받은 수 : 5, 5 -> 같은 수입니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int a = sc.nextInt();
		System.out.print("정수2: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.printf("입력받은 수 : %d, %d -> %d이(가) 큰 수 입니다",a,b,a);
		} else if (a < b) {
			System.out.printf("입력받은 수 : %d, %d -> %d이(가) 큰 수 입니다",a,b,b);
		} else if (a == b) {
			System.out.printf("입력받은 수 : %d, %d -> 같은 수 입니다",a,b);
		}
		sc.close();
	}

}
