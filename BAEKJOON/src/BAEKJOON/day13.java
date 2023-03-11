package BAEKJOON;

import java.io.IOException;
import java.util.Scanner;

public class day13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 방법1
		Scanner scan = new Scanner(System.in);
//		
//		int N = scan.nextInt();
//		int[] a = new int[N];
//		
//		for(int i = 0; i < a.length; i++) {
//			int num = scan.nextInt();
//			a[i] = num; 
//		}
//		
//		
//		int max = a[0];
//		int min = a[0];
//		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] > max) {
//				max = a[i];
//			} else if(a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println(min + " " +  max);

		
		
		// 방법2.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int max, min; // 최소값 및 최대값.
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n]; // 입력받은 정수의 개수만큼 배열 생성.
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int cnt = st.countTokens();  // 토큰의 갯수 얻어오기
//		for(int i = 0; i < cnt; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		 max = min = arr[0]; // 배열의 첫번째 값을 최소값 및 최대값으로 지정.
//		
//		
//		for(int i = 1; i< arr.length; i++) {  // 배열의 두번째 값부터 마지막 값까지 비교.
//			if(arr[i] > max)
//				max = arr[i];
//			if(arr[i] < min)
//				min = arr[i];
//		}
//		
//		System.out.println(min + " " + max);
		
		
		
		
		// 최대값.
//	 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
//	 int[] arr = new int[9];
//	 
//	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//	 int max = 0;
//	 int count = 0;
//	 for(int i = 0; i < arr.length; i++) {
//		 arr[i] = Integer.parseInt(st.nextToken());
//		 if(arr[i] > max) {
//			 max = arr[i];
//			 count = i + 1;
//		 }
//		
//		 	 
//	 }
//	 
//	 System.out.println(max);
//	 System.out.println(count);
		
		
		
		
		// 최대값 (2)
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			int input = scan.nextInt();
			num[i] = input;
		}
		
		for(int i = 0; i < 9; i++) {
			if(num[i] > max) {
				max = num[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	} // main

}
