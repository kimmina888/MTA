package day104;

public class pro1{
		int x = 25;
		public static void main(String args[]){
			pro1 app = new pro1();
			{
				int x =5;
			}
	 		{
				int x =10;
			}
			int x =100;
			System.out.println(x);
			System.out.println(app.x);
		}
		public pro1(){
			int x =1;
			System.out.println(x);
		}
}
