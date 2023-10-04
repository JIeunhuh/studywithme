package programmers.Level2;

import java.util.Arrays;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        while (scoville[0] < K) {
            int newScoville = scoville[0] + (scoville[1] * 2);
            scoville[0] = newScoville;
            scoville[1] = Integer.MAX_VALUE;
            Arrays.sort(scoville);
            answer++;
            if (scoville.length == 1) {
                return -1;
            }
        }
        return answer;
    }
}

public class 더맵게 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scoville = { 1, 2, 3, 9, 10, 12 };
        int k = 7;
        int res = sol.solution(scoville, k);
        System.out.println(res);
    }
}
