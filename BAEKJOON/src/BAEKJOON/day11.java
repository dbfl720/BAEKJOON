package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class day11 {

	public static void main(String[] args) throws IOException {
		// A+B - 5
		Scanner scan = new Scanner (System.in);
				
//		while(true) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			if(A != 0 & B != 0)
//			System.out.println(A+B);
//			else
//			break;
//		}
	

		
		
		
		// A+B - 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while( (str = br.readLine()) != null) {  // 위 코드에서 보다시피 readLine() 을 통해 입력을 하여 str 에 저장된 데이터가 null 일 경우 while 반복문을 종료시켜버리고 아닐경우 반복문을 계속 수행하도록 한다.
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
		
		
		
//		while(scan.hasNextInt()) {  // 참고로 hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료된다.
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			System.out.println(A+B);
//		}
		
	}

}
