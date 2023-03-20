package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day25 {

	public static void main(String[] args) throws IOException {
		// 단어의 개수
//		StringTokenizer
//		java.util 패키지에 속해 있으며, 하나의 문자열을 여러 개의 문자열로 분리하기 위해 사용한다.
//		문자열을 분리하기 위해 사용되는 기준 문자를 구분 문자 라고 한다.
//		구분 문자로 분리된 문자열을 토큰이라고 한다.

		 
		//1.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");  // StringTokenizer - 분리 기준을 공백으로 지정해주면 공백을 기준으로 나뉘어 토큰에 저장해주는 것이다
//		System.out.print(st.countTokens()); // countTokens() - 	분리한 토큰의 개수
	
	
	
		
		//2.
		int count = 0;
		int pre_str = 32;  // 공백을 의미한다. 아스키코드  // 이전 문자를 저장.
		int str;  // 현재 입력받은 문자 저장.
		
		while(true) {
			str = System.in.read();
			
			// 입력받은 문자가 공백일 때,
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) 
					count++;
			}
			
			// 입력받은 문자가 개명일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) 
					count++;
				break;
			}
			
			pre_str = str;
		}
		
		System.out.println(count);
	}

}


