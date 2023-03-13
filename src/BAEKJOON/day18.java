package BAEKJOON;

import java.util.Scanner;

public class day18 {

	public static void main(String[] args) {
		// 평균
		// 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
		// 모든 점수를 점수/M*100으로 고쳤다.
		// 첫째 줄에 시험 본 과목의 개수 N이 주어진다
		//  둘째 줄에 세준이의 현재 성적이 주어진다. 
		
		
		Scanner scan = new Scanner(System.in);
		
		// ※ 주의 : int형으로 나눌 경우 소숫점에 의해 값이 0으로 나오기 때문에 float형으로 해주어야 함
		int N = scan.nextInt();
		float[] subjects = new float[N];
		float max = 0;
		float average = 0;
		
		for(int i = 0; i < subjects.length; i++) {
			subjects[i] = scan.nextInt();
			if(subjects[i] > max)  {
				max = subjects[i];
			} 
		} 
		
		for(int j = 0; j < subjects.length; j++) {
			average += (subjects[j]/max * 100)/ N;
		}
		System.out.println(average);
		
	}

}
