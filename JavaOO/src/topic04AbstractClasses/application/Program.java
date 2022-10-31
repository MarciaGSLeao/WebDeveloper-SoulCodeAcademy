package topic04AbstractClasses.application;

import topic04AbstractClasses.entities.Circle;
import topic04AbstractClasses.entities.Square;

public class Program {
	
	public static void main(String[] args) {
		
		Square square = new Square(1.2, 0.8);
		Circle circle = new Circle(3.5);
		square.setColor("blue");
		circle.setColor("red");
		
		System.out.println("INFORMAÇÕES DO QUADRADO");
		System.out.println("COR = " + square.getColor());
		System.out.println("ÁREA = " + square.area());
		
		System.out.println("\nINFORMAÇÕES DO CÍRCULO");
		System.out.println("COR = " + circle.getColor());
		System.out.printf("ÁREA = %.2f%n", circle.area());
		System.out.printf("CIRCUNFERÊNCIA = %.2f", circle.calcCircunference());
	
	}

}
