package study.Tetris;

import java.util.Random;
import java.util.Scanner;

public class tetris implements Runnable {
	private static Block b1; //main method 밖에 block을 빼줌
	public static void main(String[] args) {

		Thread cmd = new Thread(new tetris());
		cmd.start();

		while (true) {
			// color, shape 배열 만들기(색이랑 모양이 랜덤하게 나오도록 하기 위해서)
			String[] arrColor = new String[] { "white", "pink", "blue", "yellow", "orange" };
			String[] arrShape = new String[] { "ㄱ", "ㄴ", "ㄹ", "ㅁ", "ㅣ" };

			Random r = new Random(System.currentTimeMillis()); // 초기 seed값 줘야 함 random(system.current)

			int ran1 = r.nextInt(5); // random 함수 호출해서 int형으로 바꿈
			int ran2 = r.nextInt(5);
			// System.out.println(ran);

			// 블럭 만들기
			 b1 = new Block(arrColor[ran1], arrShape[ran2]);

			// 블럭 떨어뜨리기
			b1.Drop();

		}

	}

	@Override //main 함수 움직이면서 동시에 작동하는 함수?
	public void run() {
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		switch (c) {
		case "a": //방향키 설정
			b1.MoveLeft();
			break;
		case "d":
			b1.MoveRight();
			break;
		case "s":
			b1.ACC();
			break;
		case "w":
			b1.Rotate();
			break;
//		case "x":
//			exit=true;
//			break;
		}
	}
}
