package day105;

public class pro5 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = ++a * b--;
		System.out.println(c); //���⼭ ��� �����? 
		int d = a-- + ++b;
		System.out.println(d); //���⼭ ��� �����? 
	}

}
