package java_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기_1920 {

    static Scanner sc = new Scanner(System.in);

    public static int[] showArr(int[] arr) { //배열 입력받아서 arr return(저장)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int N = sc.nextInt();
        int[] Narr = new int[N];
        showArr(Narr);
        
        int M = sc.nextInt();
        int Marr[] = new int[M];
        showArr(Marr);

        sc.close();

        Arrays.sort(Narr); //이진탐색 하기 전에 배열 정렬 되어있어야함

        for (int i = 0; i < M; i++) {
            
            Arrays.binarySearch(Narr, Marr[i]); //이진탐색
            
            if (Arrays.binarySearch(Narr, Marr[i]) < 0) // 0보다 작으면 Narr에 숫자가 없음
                System.out.println(0);

            else //Narr에 숫자가 있음
                System.out.println(1);
        }

    }

}
