package day103;

import java.util.Scanner;

public class pro8 {
	public static String getBirthDate(){
		System.out.println("생일은 MMDDYYYY형식으로 입력하십시오.");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	 }
}
