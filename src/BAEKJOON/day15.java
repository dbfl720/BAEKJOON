package BAEKJOON;

import java.util.Scanner;

public class day15 {

	public static void main(String[] args) {
		//  공 바꾸기
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt(); // 바구니 개수
	int M = scan.nextInt(); // 바구니 교환할 횟수
	
	int[] num = new int[N]; 

	// 배열은 0번부터 생성
	for(int i = 0; i < N ; i++) {
		num[i] = i + 1;  // 바구니에는 1번부터 N번까지 번호가 매겨져 있다.라고 했으므로 + 1 
		// System.out.println(num[i]);
	}
	
	//공 위치 바꾸기
    //바구니 번호랑 num 의 index 번호 일치를 위해 -1 해주기
	for (int i = 0; i < M; i++) {
		int tmp;
		int a = scan.nextInt();
		int b = scan.nextInt();
		tmp = num[a - 1];
		num[a -1] = num[b -1];
		num[b -1] = tmp;
	}
	scan.close();
	
	
	for(int result : num) {
		System.out.print(result + " ");
	}
	
	}

}
