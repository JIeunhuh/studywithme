package java_baekjoon;

import java.util.Scanner;
//배열에 100이하의 자연수 9개가 들어갈때, 배열의 최댓값과 그 최댓값의 index 구하기
public class array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// array 생셩
		int arr[] = new int[9];
		int max = 0;
		int index=0;
		// max 값, 최댓값 index 찾기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				index=i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
