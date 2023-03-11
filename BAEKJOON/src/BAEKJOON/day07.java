package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class day07 {

	public static void main(String[] args) throws IOException {
		// 구구단
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
//		int N = Integer.parseInt(st.nextToken());
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(N + " * " + i + " = " + (N*i));
//		}
		
		Scanner scan = new Scanner(System.in);
		
		
		// A+B -3
//		int num = scan.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			System.out.println(A + B);
//		}
		
		
		
		// 합
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
