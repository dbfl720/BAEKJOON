package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day06 {

	public static void main(String[] args) throws IOException {
		// 오븐 시계
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int A = Integer.parseInt(st.nextToken()); // 띄어쓰기 있끼 때문에 가공해야 되서,st.nextToken()
//		int B = Integer.parseInt(st.nextToken());
//		int C = Integer.parseInt(br.readLine());  //띄어쓰기 없기 때문에 가공할 필요 없어서 ,br readLine() 쓰임.
//		
//		int min = (60 * A) + B;  // 시 -> 분
//		min += C;
//		
//		int hour = (min / 60) % 24;
//		int minute = min % 60;
//		
//		System.out.println(hour + " " + minute);
		
		
		
		
		// 주사위 세개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int result = 0;
		if(a == b & b == c & a == c) {
			result = 10000 + a * 1000;
		} else if(a == b || a == c) {
			result = 1000 + a * 100;
		} else if (b == c) {
			result = 1000 + b * 100;
		} else {
			result = Math.max(a, Math.max(b,c)) *100;
		}
		
		System.out.println(result);
		
		
	    
	    

		
	} // main
	

}
