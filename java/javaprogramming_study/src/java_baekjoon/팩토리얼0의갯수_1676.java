package java_baekjoon;
//N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

// 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
// 첫째 줄에 구한 0의 개수를 출력한다.

import java.util.Scanner;

public class 팩토리얼0의갯수_1676 {

    // 내 정답 ; 로직이 틀림
    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int res = 1;

    // for (int i = N; i >= 1; i--) {
    // res *= i;
    // } // 팩토리얼 계산

    // String cnt = Integer.toString(res); // 정수형 문자열로 변환
    // int count = 0;// 0의 갯수

    // for (int j = cnt.length() - 1; j >= 0; j--) {
    // if (cnt.charAt(j) == '0') {// j번째 문자열(char형이) '0'이면 count 증가
    // // System.out.println(j);
    // count++;
    // } else // 아니면 break
    // break;
    // }
    // System.out.println(count); // 출력
    // sc.close();
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        while (N >= 5) { // 소인수 분해
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);
        sc.close();
    }

}