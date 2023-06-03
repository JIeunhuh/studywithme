package java_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
// 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 
// 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
// 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
// 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
public class usebufferreaderANDwriter {
    // 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수
    // T가 주어진다.
    // 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
    // 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩
    // 차례대로 출력해야 한다.
    public static void main(String[] args) throws IOException { //

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열의 크기 입력 받기
        int size = Integer.parseInt(br.readLine());

        // 문자열 배열 생성
        String[] strings = new String[size];

        // 배열에 문자열 입력 받기
        for (int i = 0; i < size; i++) {
            strings[i] = br.readLine();
        }

        // 입력 받은 문자열 배열을 파일에 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String str : strings) {
            bw.write(str + " ");
        }
        bw.close();

        // br.close();
    }
}
// public static void main(String[] args) throws IOException { // throws 예외 던져줘야
// 함
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //
// scanner 입력 같은
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// // sysout 출력 같은

// StringTokenizer st; // 입력값을 공백 단위로 구분하여 순서대로 호출

// int T = Integer.parseInt(br.readLine());
// for (int i = 0; i < T; i++) {
// st = new StringTokenizer(br.readLine());
// bw.write((Integer.parseInt(st.nextToken())) +
// Integer.parseInt(st.nextToken()) + "\n"); // 자동개행기능이 없으므로 줄바꿈
// // 직접 입력해주어야 함
// }

// bw.close();
// } bufferedwriter,reader 사용방법
