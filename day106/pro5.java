package day106;

public class pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "kimmina";
		System.out.println(myName);
	}
	public String showGreeting(String firstName) {
		String welcomeMsg = "æ»≥Á«œººø‰, ";
		welcomeMsg += (firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase());
		return welcomeMsg;
	}

}
