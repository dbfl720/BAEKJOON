package BAEKJOON;

import java.util.Scanner;

public class day10 {

	public static void main(String[] args) {
		// A+B - 8
		Scanner scan = new Scanner(System.in);
//		
//		int T = scan.nextInt();
//		for(int i = 1; i <= T; i++) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B) );
//		}
//		

		
		
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		int N = scan.nextInt();
//		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
		int N = scan.nextInt();
		for(int i = 1; i <= N ; i++) { // 행
			for(int j = N - 1; j >= i; j-- ) { // 열
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++ ) {  // 열
				System.out.print("*");
			}
			System.out.println();
		}
		

		
		
	}

}
