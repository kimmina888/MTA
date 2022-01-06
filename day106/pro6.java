package day106;

public class pro6 {

	public static void main(String[] args) {
		int timer = 60;
		// TODO Auto-generated method stub
		while(timer >= 0) {
			if(timer == 0)
				break;
			else {
				System.out.println("타이머가 카운트 다운 중 입니다.");
			};
			timer--;
		}
	}

}