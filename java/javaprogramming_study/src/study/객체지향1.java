package java;

class FishFrame {
	int fid;
	String color; // field값(초기값)
	int eyes = 2;

	FishFrame() {
		fid = 0;
		color = "노란색"; // 생성자 값 설정

	}// 생성자(class이름과 똑같은 함수)

	FishFrame(int fid, String color) {
		this.fid = fid;
		this.color = color;
	}// 생성자

//	public String toString() {
//		return "fid="+fid+", color="+color;
//	}

	int getEyes() {
		return this.eyes;
	}// return type이 있는 함수

	FishFrame getFish() {
		FishFrame fish = new FishFrame();

		return fish;
	}

	void setFish(FishFrame fish) {
		this.fid = fish.fid;
		this.color = fish.color;
	} // return type이 없는 함수
}

public class 객체지향1 {
	public static void main(String[] args) {
		FishFrame fish1 = new FishFrame(); // class 변수 = new 생성자();
		FishFrame fish2 = new FishFrame(10, "갈색");
		System.out.println(fish2.fid + " " + fish2.color);

		int e = fish2.getEyes(); // getEyes()

		FishFrame fish3 = new FishFrame();
		FishFrame fish4 = fish2.getFish(); // return type으로써 함수의 이름이 올 수도 있음

		fish4.setFish(fish3); //return type이 없는 함수를 호출할 때
	}
}
