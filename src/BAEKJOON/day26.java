package BAEKJOON;

import java.io.IOException;
import java.util.Scanner;

public class day26 {

	public static void main(String[] args) throws IOException {
		// 상수
		
		//1.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");  // StringTokenizer : 문자열 분리를 위해.
//		
//		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 객체 생성할때 바로 문자열 넣기 // reverse()메소드 이용 //넣어주려는 인자가 String타입이면 append()쓸 필요 없음.
//		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // StringBuilder 타입을 문자열로 반환시키기 위해 toString()을 써줌.
//		
//		System.out.println(A > B ? A : B); // 삼항연산자

		
		
		
		//2.
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		scan.close();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString()); // int A,B가 int형이라 append()사용.
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString()); //append() 로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환
	
		System.out.println(A > B ? A : B);
	}

}
