package BAEKJOON;

import java.util.Scanner;

public class day04 {

	public static void main(String[] args) {
		// 조건문 - 두 수 비교하기  1330번
		Scanner scan= new Scanner (System.in);
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		if(A > B) {
//			System.out.println(">");
//		} else if (A < B) {
//			System.out.println("<");
//		} else {
//			System.out.println("==");
//		}
		

		// 시험성적  9498번
//		int score = scan.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		
		
		
		// 윤년 2753
		int year = scan.nextInt();
		if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	} // main

}
