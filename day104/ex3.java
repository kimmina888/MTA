package day104;

public class ex3 {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0; 
		for(int k : num) {
			sum += k;
		}
		System.out.println("���� "+sum);
		
		String[] names= {"���","��","�ٳ���","ü��","����","����"};
		for(String s : names) {
			System.out.print(s+" ");
		}
		
		enum Week {��,ȭ,��,��,��,��,��};
		for(Week day : Week.values()) {
			System.out.print(day+"����");
		}
	}	
}