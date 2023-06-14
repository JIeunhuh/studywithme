package study;

//선택정렬 알고리즘
public class array2 {
	public static void main(String[] args) {
		int a[] = new int[] { 15, 11, 1, 3, 8 };
		for (int cursor = 0; cursor < a.length - 1; cursor++) { // 바꿀 수? cursor값
			// System.out.println("cursor=" + a[cursor]);
			int min = 999999999;
			int minIndex = 0;
			for (int compare = cursor + 1; compare < a.length; compare++) { // 비교해서 바꿀 값
				// System.out.println("compare=" + a[compare]);

				if (min > a[compare]) { // min값이 a[compare]보다 크면 min값에 a[compare]를 정의
					min = a[compare];
					minIndex=compare;
				}

				if (a[cursor] > min) { // a[cursor]값이 min 값보다 크면 min값과 배열정렬 위치?를 바꿈
					int temp = a[cursor];
					a[cursor] = min;
					a[minIndex] = temp;
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}

		}

	}

}
