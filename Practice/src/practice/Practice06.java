package practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		/*
		 - 정수 3개를 입력받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해보세요.

		 # max, mid, min이라는 변수를 미리 선언하셔서 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		   마지막에 한 번에 출력하시면 되겠습니다.
		   
		 *** 추가 문제 ***
		 숫자가 같을 시 비교가 불가하다는 메시지를 출력하세요.
		 
		 */
		int max=0, mid=0, min=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int a = sc.nextInt();
		System.out.print("정수2: ");
		int b = sc.nextInt();
		System.out.print("정수3: ");
		int c = sc.nextInt();
		
		if(a>b && b>c) {
			max=a; mid=b; min=c;
		} else if(a>b && b<c && a>c) {
			max=a; mid=c; min=b;			
		} else if(b>a && a>c) {
			max=b; mid=a; min=c;			
		} else if(b>a && a<c && b>c) {
			max=b; mid=c; min=a;			
		} else if(c>a && a>b) {
			max=c; mid=a; min=b;
		} else if(c>a && a<b && c>b) {
			max=c; mid=b; min=a;
		} else if(a == b || b == c || a == c) {
			System.out.println("비교 할 수 없습니다.");
		}
		System.out.printf("최대값: %d 중간값: %d 최소값: %d", max,mid,min);
		sc.close();
	}

}
