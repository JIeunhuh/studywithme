package study;

public class star1 { //별표 줄바꿔서 공백 하나씩 증가시키기 -> 직각삼각형 출력하기 -> 정삼각형 출력 -> 반대로 
	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//System.out.print("*");
			System.out.println();
		}
	}
}
