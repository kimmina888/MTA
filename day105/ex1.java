package day105;

public class ex1 {
	class A{
		public A() {
			System.out.println("������A");
		}
		public A(int x) {
			System.out.println("�Ű����� ������A");
		}
	}
	class B extends A{
		public B() {
			System.out.println("������B");
		}
		public B(int x) {
			System.out.println("�Ű����� ������B");
		}
	}
	public class ConstructorEx3{
		public static void main(String[] args) {
			B b;
			b = new B(5);
		}
	}
}