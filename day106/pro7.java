package day106;

public class pro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 1 / 0;
			System.out.println("try");
		}catch(ArithmeticException ex) { //작은것부터 catch하자
			System.out.println("ArithmeticException");
		}catch(Exception ex) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}

}
