package day106;

public class pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s2;
		String s4 = new String("Hello World");
		if(s1 == s2) {
			System.out.println("s1 s2 ���� ��ü�� �����մϴ�.");
		}	
		if(s1 == s3) {
			System.out.println("s1 s3 ���� ��ü�� �����մϴ�.");
		}
		if(s1 == s4) {
			System.out.println("s1 s3 ���� ��ü�� �����մϴ�.");
		}else {
			System.out.println("s1 s4�� ���� ��ü�� ���� ���� �ʽ��ϴ�.");
		}
		s1 ="abc";
		s2 = "def";
		System.out.println(s1);
		System.out.println(s2);
	}

}
