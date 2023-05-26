package java;

import java.util.Random;

public class 타입별행렬만들기 {
	static void showIntMatrix(Integer arr[][]) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(10);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void showDoubleMatrix(Double arr[][]) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextDouble(30);
				System.out.print(String.format("%.2f", arr[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	static void showLongMatrix(Long arr[][]) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextLong(50);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // 이렇게 코드 거의 똑같은 함수 여러개 만드는거 비효율적임 , 그럴때 제너릭 사용함

	private static <T> void showMatrix(T[][] arr) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {//instanceof : 객체가 어떤 클래스의 인스턴스인지를 확인하기 위해 사용되는 연산자
				if (arr[i][j] instanceof Integer) {
					arr[i][j] = (T) Integer.valueOf(rd.nextInt(30)); //int형 Integer class 객체로 바꾸기 -> (T) 타입으로 바꾸기
					System.out.print(arr[i][j] + "\t");
				} else if (arr[i][j] instanceof Double) {
					arr[i][j] = (T) Double.valueOf(rd.nextDouble(30));
					System.out.print(String.format("%.2f", arr[i][j]) + "\t");
				} else if (arr[i][j] instanceof Long) {
					arr[i][j] = (T) Long.valueOf(rd.nextLong(50));
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("=".repeat(40));
	}

	// generic method() 만드는 방법 : <T> T method(T 변수명)
	private <T extends Number> T getNumber(T t) { // extends Number : Number class를 상속받은 객체만 사용할 수 있음
		return t;
	}

	public static void main(String[] args) {

		Integer[][] intarr = new Integer[2][3];
		Double[][] doublearr = new Double[2][3];
		Long[][] longarr = new Long[2][3];

		showIntMatrix(intarr);
		System.out.println("\n" + "=".repeat(40));
		showDoubleMatrix(doublearr);
		System.out.println("\n" + "=".repeat(40));
		showLongMatrix(longarr);
		System.out.println("\ngeneric 이용해서 만든 showMatrix():");
		System.out.println("=".repeat(40));
		
		타입별행렬만들기 num = new 타입별행렬만들기();
		num.<Integer>getNumber(intarr[0][2]);

		
		타입별행렬만들기.<Integer>showMatrix(intarr); // <T>.method(객체명); & 제너릭 함수 만들어서 어떤타입이든 넣을 수 있음
		타입별행렬만들기.<Double>showMatrix(doublearr);
		타입별행렬만들기.<Long>showMatrix(longarr);
		

	}
}
