package topic02AccessControls.application;

import topic02AccessControls.entities.People;

public class Program {

	public static void main(String[] args) {
		
		People person = new People("Márcia", "00011122233", 32);
		
		System.out.println("Dados: " + person.getName() + " - "
									 + person.getCpf() + " - "
									 + person.getAge());
	}
}
