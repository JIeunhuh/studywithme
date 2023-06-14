package study;

//2~1000까지의 숫자 중 2의 제곱수를 모두 더한 결과 출력하기
public class 제곱수 {
	public static void main(String[] args) {
		int value = 0;
		int square = 1;
		int sum = 0;
		while (value <= 1000) {
			value = (int) Math.pow(2, square); //Math.pow(밑수, 지수) >> 제곱기호 없음; method 활용해서 구해야함 
			if (value >= 1000) {
				break;
			}
			sum += value;
			square++;
			
		}
		System.out.println(sum);
	}
}
