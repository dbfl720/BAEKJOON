package BAEKJOON;

import java.util.Scanner;

public class day12 {

	public static void main(String[] args) {
		// 개수 세기
		Scanner scan = new Scanner(System.in);
		
//		int N = scan.nextInt();
//		
//		int[] array = new int [N];
//
//		for( int i = 0; i < array.length; i++) {
//			array[i] = scan.nextInt();
//		}
//		
//		
//		
//		int v = scan.nextInt();
//		int count = 0;
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] == v) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		// X보다 작은 수
		int N = scan.nextInt();
		int[] array = new int[N];
		int X = scan.nextInt();
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]< X) {
				System.out.print(array[i] + " ");
			} 
		}
		
		
		
		
		
		// X보다 작은 수
		
	}

}
