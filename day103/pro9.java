package day103;

public class pro9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int income = 0;
		if(((age >= 65) && (income == 10000)) || ((age >= 21)&&(income >= 25000))){
			System.out.print("계정 추가");
		}else {
			System.out.print("계정 추가 실패");
		}
	}

}
