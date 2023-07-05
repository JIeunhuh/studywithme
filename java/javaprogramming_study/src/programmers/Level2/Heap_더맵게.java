package programmers.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// class Solution {
    
//     }
    // public int solution(int[] scoville, int K) {
    //     int answer = 0;
    //     Arrays.sort(scoville);
    //     for (int i : scoville) {
    //         System.out.println(i);
    //     }
    //    return answer;
    // }


public class Heap_더맵게 {

    public static void solution(int[] scoville, int K) {
        // int answer = 0;
        Arrays.sort(scoville);
        for (int i : scoville) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] scovilleLen = br.readLine().split(" ");
        int[] scoville = new int[scovilleLen.length];
        solution(scoville, 8);
    }
    
    
}
