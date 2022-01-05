package day105;

public class ex4 {

	public static void main(String[] args) {
		String a = new String(" C#");
		System.out.println(a);
		String b = new String(",C++ ");
		System.out.println(b);
		
		a=a.concat(b);
		System.out.println(a);
		System.out.println(b);
		
		a = a.trim();
		a= a.replace("C#", "JAVA");
		System.out.println(a);
		
		String s[] = a.split(",");
		System.out.println(s);
		System.out.println(a);
		a= a.substring(5);
		System.out.println(a);
		char c = a.charAt(2);
		System.out.println(c);
	}

}
