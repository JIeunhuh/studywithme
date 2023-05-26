package java_baekjoon;

//N개의 정수가 주어질때, 배열의 최솟값 최댓값 구하기
import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 N개 입력
		int N = sc.nextInt();
		//정수 N개를 받는 배열 입력
		int[] num = new int[N];
		int max = 0;
		int min = 0;
		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();
			// 배열의 max, min 구하기
			if (min >= num[i]) {
				min = num[i];
			} else if (true) {
				min = num[0];
				if (max <= num[i]) {

					max = num[i];
				}
			}
		}
		System.out.print(min + " " + max);
	}
}
