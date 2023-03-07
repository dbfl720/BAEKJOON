package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class day05 {

	public static void main(String[] args) throws IOException { //BufferReader 사용시 throws 해줘야 함.
		// 사분면 고르기
		Scanner scan = new Scanner(System.in);
		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		if(x > 0 & y > 0) {
//			System.out.println(1);
//		} else if (x < 0 & y > 0) {
//			System.out.println(2);
//		} else if (x < 0 & y < 0) {
//			System.out.println(3);
//		} else {
//			System.out.println(4);
//		}
		
		
		
		// 알람 시계
//		int h = scan.nextInt(); // -1
//		int m = scan.nextInt();  // + 15
//		
//		if(h == 0) {
//			System.out.print("23" + " ");
//			System.out.print(m + 15);
//		} else {
//			System.out.print(h - 1 + " ");
//			System.out.print(m + 15);
//		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
		
		

	}

}
