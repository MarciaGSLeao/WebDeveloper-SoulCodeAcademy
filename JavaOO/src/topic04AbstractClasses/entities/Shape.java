package topic04AbstractClasses.entities;

public abstract class Shape {
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public abstract double area();
}
