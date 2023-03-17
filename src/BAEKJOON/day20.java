package BAEKJOON;

import java.util.Scanner;

public class day20 {

	public static void main(String[] args) {
		// 문자열
		// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.	
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			String str = scan.next();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length() - 1));
		}
	}

}
