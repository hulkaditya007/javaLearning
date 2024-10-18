package javalearning;

public class Shape123 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Triangle t3 = new Triangle();
		
		System.out.println(Triangle.count);
		

	}

}


class Triangle{
	
  static int count = 0;
  public Triangle() {
	  count++;
  }
}