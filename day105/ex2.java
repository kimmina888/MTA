package day105;

public class ex2 {
	class Shape{
		protected String name;
		public void Paint() {
			draw();
		}
		public void draw() {
			System.out.println(name);
		}
	}
	public class Circle extends Shpae{
		protected String name;
		@Override
		public void draw() {
			name="Circle";
			super.name = "Shape";
			super.draw();
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape b = new Circle();
		b.Paint();
	}

}
