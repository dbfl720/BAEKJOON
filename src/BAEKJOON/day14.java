package BAEKJOON;

import java.util.Scanner;

public class day14 {

	public static void main(String[] args) {
		// 공 넣기
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 	바구니번호
		int M = scan.nextInt();	//   공 넣은 범위
		int[] basket = new int[N];  // 바구니 배열.
		
		
		 
		for(int i = 0; i < M; i++) {
			int b = scan.nextInt();  // b번 바구니부터
			int f = scan.nextInt();  // j번 바구니까지
			int k = scan.nextInt();   // k번 번호 공을 넣는다.
			for(int j = b - 1 ; j < f; j++) {
				basket[j] = k;
				System.out.println(basket[j]);
			}
		}
		
		for(int result : basket) {
			System.out.print(result + " ");
		}
		

	}

}
