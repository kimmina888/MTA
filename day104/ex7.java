package day104;

public class ex7 {
	public class Circle{
		int radius;
		String name;
		
		public Circle() {
			this.radius =1;
			this.name=" ";
		}
		public Circle(int r, String n) {
			this.radius = r;
			this.name = n;
		}
		public double getArea() {
			return 3.14*radius*radius;
		}
	}
	static void main(String args[]) {
		Circle pizza = new Circle(10,"�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut = new Circle();
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}
}
