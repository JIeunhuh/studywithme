package java_baekjoon;

import java.util.Scanner;

// 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
// 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
// 합을 나타낼 때 수를 1개 이상 사용
public class 더하기_9095 {
    // Dynamic Programming : 작은 문제가 반복이 일어나는 경우(재귀) / 같은 문제는 구할 때마다 정답이 같음

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // testcase
        int[] n = new int[T]; // 각 테스트 케이스에 입력받는 정수배열

        for (int i = 0; i < T; i++) {
            n[i] = sc.nextInt(); 
        }

        for (int i = 0; i < T; i++) {
            System.out.println(recur(n[i]));
        }

        sc.close();
    }

    // 1,2,3 이용해서 합 구하는 재귀함수 만들기
    static int recur(int n) {
        
        if (n == 1) //합이 1이면 1 리턴(1)
            return 1;
        else if (n == 2) //2이면 2리턴(1+1/2)
            return 2;
        else if (n == 3)//3이면 4(1+1+1/1+2/2+1/3)
            return 4;

        n = recur(n - 1) + recur(n - 2) + recur(n - 3); // recur(3),(2),(1)이 될때까지 반복 -> 그 리턴값 다 합함 -> 1,2,3으로 만들 수 있는 정수 n의 모든 방법의 수가 됨
        return n;
    }
}
