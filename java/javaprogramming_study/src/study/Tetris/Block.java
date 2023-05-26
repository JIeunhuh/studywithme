package study.Tetris;

//블럭 클래스 만들기
//모양 , 색 , 방향 , 좌우 (shape, color , rotation)
public class Block {
	private int x_position;// private 접근제한자
	private int y_position; // 좌우 방향
	private String color = "white";// 색
	private String shape = "square";// 모양
	private int rotation;
	

	// 생성자
	public Block(String c, String s) {
		this.x_position = 4;
		this.y_position = 20;
		this.rotation = 0;
		this.color = c;
		this.shape = s;
	}

	public String toString() {
		return "color = " + this.color + ", shape = " + this.shape + ", xPos = " + this.x_position + ", yPos = "
				+ this.y_position + ", rot = " + this.rotation;
	}

	// 행동 함수 ( 떨어뜨리기, 좌우 움직임, 빨리 움직임, 돌리기?)
	// 떨어뜨리기
	protected void Drop() {
		while (this.y_position > 0) {//yposition이 0보다 클때까지 블럭을 떨어트림
			System.out.println("블럭이 떨어지고 있습니다." + this.toString());
			this.y_position--;//증감연산자 붙여줌
			// 1s를 쉬도록 하는 코드(예외처리 해야함)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// 같은 클래스 내에서만 사용가능 함

	// 좌우 움직임
	protected void MoveLeft() {
		this.x_position--;
	}

	protected void MoveRight() {
		this.x_position++;
	}

	// 가속(빨리 내려오게 하기)
	protected void ACC() {
		this.y_position--;
	}

	// 테트리스 회전 시키기(0,90,180,270,360) 반복
	protected void Rotate() {
		this.rotation += 90;
		this.rotation %=360; //360도 보다 커지게 않게 하기 위해서
//		if(this.lotation>=360) {
//			this.lotation=0;
//		}
	}
}
