package BAEKJOON;

import java.util.Scanner;

public class day21 {

	public static void main(String[] args) {
		// 아스키 코드
		Scanner scan = new Scanner(System.in);
		
		String sr = scan.next();
		int result = sr.charAt(0);  // charAt 메소드 -지정된 위치에 있는 문자를 알려준다. index는 0부터 시작. 입력받는 문자가 하나이므로 0번째 문자를 int형식의 result에 집어 넣는다.
		
		System.out.println(result);  // 아스키코드는 String값으로 받은 변수를 int타입으로 변환하여 아스키코드 값으로 저장된다.
	}

}
