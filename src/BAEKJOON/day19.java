package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day19 {

	public static void main(String[] args) throws IOException {
		// 문자와 문자열
		

//		Scanner scan = new Scanner(System.in);
//		
//		String S = scan.next();
//		int I = scan.nextInt();
//		System.out.println(S.charAt(I - 1));
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine().trim();
//		int idx = Integer.parseInt(br.readLine());
//		
//		System.out.println(str.substring(idx-1, idx));  // substring (int begin, int end) 메소드 이용.
//	
	
		
		
		// 단어 길이 재기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		int length = str.length();  // length() 메소드는 문자열의 길이를 리턴해준다.
		
		System.out.println(length);
		
	}

}
