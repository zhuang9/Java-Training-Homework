package Question7;

//Example of overload

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double R) {
		radius = R;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public static void main(String[] args) {
		Circle c = new Circle(5.0); // Can with parameter or without parameter
		System.out.println(c.getArea());
	}
}