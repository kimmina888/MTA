package day105;

public class pro5 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = ++a * b--;
		System.out.println(c); //여기서 출력 결과는? 
		int d = a-- + ++b;
		System.out.println(d); //여기서 출력 결과는? 
	}

}
