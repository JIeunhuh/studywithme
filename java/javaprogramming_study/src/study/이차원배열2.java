package study;

public class 이차원배열2 {
	public static void main(String[] args) {
		// 배열 2개 지정하기
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		System.out.println("- matrix 1 출력 -");
		showMatrix(arr1);

		System.out.println("- matrix 2 출력 -");
		showMatrix(arr2);

		int[][] arr3 = sumMatrix(arr1, arr2);
		System.out.println("- 행렬의 합 구하기 -");
		showMatrix(arr3);
	}

	// method 만들어서 호출하기(중복된 코드를 없애기 위해서 )
	static void showMatrix(int[][] m) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//행렬의 합 구하는 함수 만들기
	static int[][] sumMatrix(int[][] m1, int[][] m2) {
		int res[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				res[i][j] = m1[i][j] + m2[i][j]; // 행렬의 합 구하는 공식?
			}
		}
		return res;
	}
}