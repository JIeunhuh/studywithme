package java_baekjoon;

//N개의 정수가 주어질 때, 최대 최소를 구하기
//정수 N개의 최대 최소값을 공백으로 구분해 출력
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}

	}
}