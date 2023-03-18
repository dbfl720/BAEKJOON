package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day23 {

	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		
//		int[] alphabet = new int[26];
//		String S = scan.next();
//		for(int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = -1;  // 모두 -1로 초기화 시킨다. 문자열 S에 각 문자의 위치를 가리킬 배열.
//		}
//		
//		for(int i = 0; i < S.length(); i++) {
//			char ch = S.charAt(i);  // chatAt - 지정된 위치(index)에 있는 문자를 알려준다.	
//			if(alphabet[ch - 'a'] == -1) {   // arr 원소 값이 -1인 경우에만 초기화.  동일 문자가 포함되어있는 경우 처음 나타난 위치로 나타내야한다.
//				// 즉, 문자열을 앞에서부터 검사할 때, 앞선 동일문자가 존재하여 arr 에 위치를 변경했을 경우는 arr 의 값을 변경하지 않으면 된다.
//				//이 의미는 결국 -1 인 경우에는 배열의 원소 값을 변경하고 -1 이 아닌 경우 배열의 원소 값을 변경하지 않는다.
//			
//				alphabet[ch - 'a'] = i;
//			}
//		}
//		
//		for(int val : alphabet) {
//			System.out.print(val + " ");
//		}
		
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			if(alphabet[ch - 'a'] == -1) {
				alphabet[ch - 'a'] = i;
			}
		}
		
		for(int val : alphabet) {
			System.out.print(val + " ");
		}
	}

}
