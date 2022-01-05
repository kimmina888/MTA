package day105;

import java.util.ArrayList;

public class pro6 {
	public static void Process(ArrayList<String> invoices){
		for(int i = 0; i < invoices.size(); )
		{
			String invoice = invoices.get(i);
			System.out.println(invoice);
			invoices.remove(i);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> invoices = new ArrayList<String>();
		invoices.add("인형 5000");
		invoices.add("집모양장난감 10000");
		invoices.add("노트북모양장난감 80000");
		Process(invoices);
	}
}
