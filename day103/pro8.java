package day103;

import java.util.Scanner;

public class pro8 {
	public static String getBirthDate(){
		System.out.println("������ MMDDYYYY�������� �Է��Ͻʽÿ�.");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	 }
}
