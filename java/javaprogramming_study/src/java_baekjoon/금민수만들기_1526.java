package java_baekjoon;
//은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다. 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.

//N이 주어졌을 때, N보다 작거나 같은 금민수 중 가장 큰 것을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class 금민수만들기_1526 {
//첫째 줄에 N이 주어진다. N은 4보다 크거나 같고 1,000,000보다 작거나 같은 자연수이다.
//첫째 줄에 N보다 작거나 같은 금민수 중 가장 큰 것을 출력한다.

	static int N = 0; // 전역변수로 설정 
	
	// 최댓값 찾는 함수 만들기
	public static int findMax(int n) {
		int num = n;
		while (true) {
			if ((n * 10) + 4 <= N || (n * 10) + 7 <= N) { // 4나 7나오는 재귀함수
				num = findMax(n * 10 + 4);
				num = Math.max(num, findMax((n * 10) + 7));
			} 
			break;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int max = findMax(0); // 함수 호출

		System.out.println(max);

		sc.close();
	}
}
