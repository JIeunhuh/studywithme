package programmers.Level1;

// array의 i번째 ~ j번째 숫자를 자르고 정렬해서 k번째 있는 숫자 구하기

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // copyofRange(int arr , start , end) 잘라오는 범위 : ( start , end ]
        int[] answer = new int[commands.length];
        for (int i = 0; i < answer.length; i++) {
            // i - 1 해줘야 함
            int start = commands[i][0] - 1;
            // 끝은 포함 안돼서 -1 해줄 필요 없음
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            int[] slicing = Arrays.copyOfRange(array, start, end);
            Arrays.sort(slicing);
            answer[i] = slicing[k];
        }
        return answer;
    }
}

public class K번쨰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = {
                { 1, 5, 3 },
                { 4, 5, 1 },
                { 2, 4, 3 }
        };
        int[] res = sol.solution(array, commands);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}
