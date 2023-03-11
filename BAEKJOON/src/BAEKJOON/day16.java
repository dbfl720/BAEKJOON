package BAEKJOON;

import java.util.HashSet;
import java.util.Scanner;

public class day16 {

	public static void main(String[] args) {
		// 과제 안 내신 분..?
		Scanner scan = new Scanner(System.in);
		
		
		boolean submit[] = new boolean[31]; // 출석을 0부터 안세고 1부터 세기 때문에 31로 세팅. boolean타입으로 선언하면 false로 초기화 됨.
		
		for(int i = 0; i < 28; i++) {
			submit[scan.nextInt()] = true;  //  28명의 번호를 입력하니, 해당 위치  배열값은 true로 지정.
		}
		
		for(int i = 1; i <= 30; i++) {
			if(submit[i] == false) {  // 배열을 돌면서 false인 경우만 출력
				System.out.print(i);
			}
		}
		

	}

}
