package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day24 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문자열 반복

		// 1.
//		Scanner scan = new Scanner(System.in);
//		
//		int  T = scan.nextInt();  // 테스트 케이스의 개수
//		for(int i = 0; i < T; i++ ) {
//			int R = scan.nextInt();
//			String S = scan.next();  // nextLine()은 엔터를 입력받을 때까지 기준으로 한 줄을 읽기에, error. // next는 공백을 기준으로 하나의 문자열을 읽음.
//			
//			for(int j = 0; j < S.length(); j++) {  
//				for(int k = 0; k < R; k++) {  // R만큼 반복 출력
//					System.out.print(S.charAt(j));   // 문자의 길이까지인 j로 출력
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		// 2.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");  // 공백 분리 // 배열에 담기
			int R = Integer.parseInt(str[0]);   // String -> int  // 배열 0 번째는 R 
			String S = str[1];  // 배열 1번째는 S
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j)); // S문자를 반환해야 해서 j
				}
			}
			
			System.out.println();
		}
		
	} // main 

}
