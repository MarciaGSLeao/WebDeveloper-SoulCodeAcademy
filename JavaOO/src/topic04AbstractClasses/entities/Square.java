package topic04AbstractClasses.entities;

public class Square extends Shape {
	
	private double width;
	private double height;
	
	public Square() {
	}
	
	public Square(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}
