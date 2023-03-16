package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
		// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

		// 나누기
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashSet<Integer> h = new HashSet<Integer>(); // HashSet은 중복 값 제거해줌.
//		
//		for(int i = 0; i < 10; i++) {
//			h.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		
//		System.out.println(h.size());
		
		
		
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {  // value 가 true라면 
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
		
//		예로들어 3, 45, 47을 입력받았다고 가정해봅시다.
//
//		기본적으로 boolean[] arr 의 경우 모든 인덱스는 false 값을 갖습니다.
//
//		그러면 이제 하나씩 계산해보죠.
//		arr[3 % 42] = true; 라는 건 arr[3] = true;라는 뜻이죠.
//		그리고 arr[45 % 42] = true; 라는 것은 arr[3] = true로 앞서 3을 입력받았을 때와 같은 인덱스를 가리킵니다.
//		즉, 같은 나머지를 갖는 값은 같은 인덱스를 가리키게 되면서 중복 제거가 되죠.
//		반대로 47의 경우 arr[47 % 42] = true는 arr[5]=true이기 때문에 다른 인덱스를 true로 저장하게 됩니다.
//
//		결국, 마지막에 arr의 모든 인덱스를 순회하면서 true 인 인덱스의 수를 세게 되면, 2개의 인덱스(3, 5)가 되면서 결과값은 2가 되겠죠 :)
//		
		
		
		
		
		// 바구니 뒤집기
		// 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
		//  M번 바구니의 순서를 역순으로 만들려고 한다
		//  왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다
		// 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int N = Integer.parseInt(st.nextToken()); // 바구니 번호
//		int M = Integer.parseInt(st.nextToken()); // 바구니 역순 순서 바꿀 횟수
//		int[] basket = new int[N + 1];  // 인덱스 0부터 시작하니, 바구니는 1번부터 N번까지 번호가 매겨져 있으므로 + 1 
//		
//		
//		// 바구니 번호 매기기
//		for(int i = 1; i <= N; i++) {  
//			basket[i] = i;
//		}
//		
//		
//		// 바구니 역순 순서 바꿀 횟수
//		for(int k = 0; k < M; k++) {
//			Stack<Integer> stack = new Stack<>();  // 스택 배열 생성(후입선출 LIFO), 바구니를 뒤집을 범위를 입력받으면 Stack에 push하고 다시 pop을 해서 원래 배열에 담으면 뒤집어진 상태로 출력이 되기 때문에 원하는 결과를 얻을 수 있다.
//			st = new StringTokenizer(br.readLine(), " ");
//			int i = Integer.parseInt(st.nextToken());
//			int j = Integer.parseInt(st.nextToken());
//			
//			for(int m = i; m <= j; m++)   // i번째부터 j번째 까지 역순.
//				stack.push(basket[m]);
//			
//			
//			for(int m = i; m <= j; m++) 
//				basket[m] = stack.pop();
//			
//		}
//		
//		
//		
//		StringBuilder sb = new StringBuilder();  // StringBuilder 객체 생성 (StringBuffer의 쓰레드 동기화를 뺀 것), StringBuffer와 기능은 똑같음.
//		for(int i = 1; i <= N; i++)
//			sb.append(basket[i] + " ");   // append() -  입련되 값을 문자열로 반환하여 저장되어 있는 문자열 뒤에 덧붙인다.
//		
//		
//		bw.write(sb.toString());
//		bw.flush();
//		bw.close();
//		br.close();
		
	} // main
	
		
		
}

