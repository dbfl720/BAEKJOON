package BAEKJOON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class day09 {

	public static void main(String[] args) throws IOException {
		// 빠른 A+B
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//		StringTokenizer st;
//		
//		for(int i = 0; i < T; i++) {
//			st = new StringTokenizer(br.readLine()," ");  // 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력받는다.
//			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");  // 반환되는 타입은 String 이므로 Integer.parseInt를 통해 int형으로 바꾸어 준다. 이렇게 바꾼 두 토큰을 더해준 값을 BufferedWriter.write() 에 넣어준다.
//		}
//		
//		br.close(); 
//		
//		bw.flush(); //필수적으로 버퍼를 비운 뒤(flush) 닫아줘야한다(close).
//		bw.close();


// Scanner 통해 간단히 풀 수 있지만,BufferedReader, BufferedWriter 통해 풀어야 한다. (시간 속도 빠름)
// BufferedReader는 예외처리 해주어야 한다.
// BufferedReader는 한 라인을 읽기 때문에 StringTokenizer를 통해 공백 단위 데이터 가공이 필요하다.
// BufferedWriter는 write로 출력하되 개행이 안되기 때문에 "\n"을 입력해줘야 한다.
// flush()로 남아있는데 데이터를 모두 출력 후에 close로 닫아줘야 한다.

		
		
		
		
		// A+B - 7
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #" + i + ": ");
			bw.write(Integer.parseInt(st.nextToken()) +Integer.parseInt(st.nextToken()) +"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
		
		
	}

}