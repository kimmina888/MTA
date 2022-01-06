package day106;

public class pro2 {

	public static void main(String[] args) {
		String pi = "3.14";
		convertStringToNumber(pi);
	}
	public static void convertStringToNumber(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}

}
