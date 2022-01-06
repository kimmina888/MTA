package day106;

public class pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s2;
		String s4 = new String("Hello World");
		if(s1 == s2) {
			System.out.println("s1 s2 같은 개체를 참조합니다.");
		}	
		if(s1 == s3) {
			System.out.println("s1 s3 같은 개체를 참조합니다.");
		}
		if(s1 == s4) {
			System.out.println("s1 s3 같은 개체를 참조합니다.");
		}else {
			System.out.println("s1 s4는 같은 객체를 참조 하지 않습니다.");
		}
		s1 ="abc";
		s2 = "def";
		System.out.println(s1);
		System.out.println(s2);
	}

}
