package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day22 {

	public static void main(String[] args) throws IOException {
		// 숫자의 합
//		Scanner scan = new Scanner(System.in);
//		
//		int sum = 0;
//		int N = scan.nextInt();
//		String a = scan.next(); // 숫자를 정수가 아닌 String (문자열)로 입력을 받는다.
//		
//		for(int i = 0; i < N; i++) {
//			sum += a.charAt(i) - 48;  //  charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
//		}
//		System.out.println(sum);

		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();  // N은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) { // getBytes() - String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드/ 변환되는 방법은 Charset 에서 사용되는 인코딩 방식, 즉 UTF-16 인코딩으로 변경되는 값을 따른다. * UTF-16 (유니코드)의 앞부분은 아스키코드와 호환되기 때문에 영어 문자 및 숫자는 같다. 즉 아스키 코드에서 0 이라는 문자는 48 라는 값이고 이는 UTF-16 에서도 48 이라는 값을 갖는다.
			sum += (value - '0');  // 또는 a - 48  // readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 for-each 구문을 통해 문자열의 문자를 하나하나씩 읽는다.
		}
		
		System.out.print(sum);
		
		
	} // main

}
