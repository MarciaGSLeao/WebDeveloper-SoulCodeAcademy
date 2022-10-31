package topic04AbstractClasses.application;

import topic04AbstractClasses.entities.Circle;
import topic04AbstractClasses.entities.Square;

public class Program {
	
	public static void main(String[] args) {
		
		Square square = new Square(1.2, 0.8);
		Circle circle = new Circle(3.5);
		square.setColor("blue");
		circle.setColor("red");
		
		System.out.println("INFORMA��ES DO QUADRADO");
		System.out.println("COR = " + square.getColor());
		System.out.println("�REA = " + square.area());
		
		System.out.println("\nINFORMA��ES DO C�RCULO");
		System.out.println("COR = " + circle.getColor());
		System.out.printf("�REA = %.2f%n", circle.area());
		System.out.printf("CIRCUNFER�NCIA = %.2f", circle.calcCircunference());
	
	}

}
