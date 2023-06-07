package study;


//배열의 덧셈
public class 이차원배열 {
	public static void main(String[] args) {
		// 배열 2개 지정하기
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		
		System.out.println("- matrix 1 출력 -");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("- matrix 2 출력 -");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("- 행렬의 합 구하기 -");
		int[][] sum = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			sum[i][j] = arr1[i][j]+arr2[i][j]; //행렬의 합 구하는 공식? 
			System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
