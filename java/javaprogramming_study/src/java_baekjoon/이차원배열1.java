package java_baekjoon;
//행렬의 합 구하기
import java.util.Scanner;
//입력한 정수 N,M으로 행렬 두개 만들어서 합구하기
public class 이차원배열1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		int sum[][] = new int[N][M];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j] = (A[i][j] + B[i][j]);
				System.out.print(sum[i][j] + " ");

			}
			System.out.println();
		}
	}
}
