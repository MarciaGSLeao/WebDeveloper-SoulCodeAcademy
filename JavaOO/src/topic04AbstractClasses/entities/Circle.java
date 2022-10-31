package topic04AbstractClasses.entities;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * (this.radius * this.radius);
	}
	
	public double calcCircunference() {
		return 2 * Math.PI * radius;
	}

}
