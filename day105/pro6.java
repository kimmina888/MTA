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
		invoices.add("���� 5000");
		invoices.add("������峭�� 10000");
		invoices.add("��Ʈ�ϸ���峭�� 80000");
		Process(invoices);
	}
}
