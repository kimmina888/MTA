package day106;

public class pro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int age = 27;
		double discount;
		if(age >= 25) {
			
		}
		switch(age) {
		case 25 : discount = 0.50; break;
		case 24: case 23: case 22: case 21: discount = 0.25; break;
		default : discount = 0.0;
		}
		
		//2
		char grade = 'A';
		String mesg;
		if(grade == 'A') {
			mesg="ǥ���ʰ�";
		}else if(grade == 'B') {
			mesg ="ǥ������";
		}
		else {
			mesg = "�����ʿ�";
		}
		switch(grade) {
			case 'A' :mesg="ǥ���ʰ�";
			case 'B' :mesg="ǥ������";
			default :mesg="�����ʿ�";
		}
		int prioruty;
		//3
		double age2 = 2.7;
		if(age2 == 4.0) {
			prioruty = 1;
		}else if(age2 == 3.0) {
			prioruty = 2;
		}else if(age2 >= 2.5) {
			prioruty = 3;
		}
		switch(age2) {
			case 4.0 :prioruty = 1;
			case 3.0:prioruty = 2;
			case 2.9:prioruty = 3;
			case 2.8:prioruty = 3;
			case 2.7:prioruty = 3;
			case 2.6:prioruty = 3;
			case 2.5 :prioruty = 3;
		}
	}

}
