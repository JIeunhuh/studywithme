package study;

public class array {
	public static void main(String[] args) {
		int[] num = { 11, 12, 13, 14, 15 };
		//array 역으로 출력하기1
//		for (int i = num.length-1; i>=0; i--) {
//			System.out.print(" "+num[i]);
//		}
		//array 역으로 출력하기2
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[num.length - i - 1]+'\n');
		} 
		//회문 출력하기
		boolean result = true;
		for (int i = 0; i < num.length; i++) { //.length 습관화하기 !!
			if (num[i] == num[num.length - i - 1]) {
				result = true;
			} else {
				result = false;
				break;
			}

		}
		if (result == true) {
			System.out.println("회문입니다.");
		} else
			System.out.println("회문이 아닙니다.");
	}

}
