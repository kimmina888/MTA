package day104;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		int sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length+"���� ������ �Է��ϼ��� >> ");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
		}
		for(int i=0; i<intArray.length; i++) {
			sum+=intArray[i];
		}
		System.out.print("����� "+(double)sum/intArray.length);
		scanner.close();
	}

}
