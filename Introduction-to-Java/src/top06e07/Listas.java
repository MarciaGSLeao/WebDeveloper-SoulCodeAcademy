package top06e07;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	public static void main(String[] args) {
		
		
		List<String> listNames = new ArrayList<>();
		
		System.out.println(listNames);
		
		// ADICIONANDO...
		listNames.add("Márcia");
		listNames.add("João");
		listNames.add("Felipe");
		listNames.add("Helena");
		listNames.add(4, "Novo gatinho");
		System.out.println(listNames);
		listNames.add(2, "Filhote");
		System.out.println(listNames);
		listNames.clear();
		System.out.println(listNames);
		
	}
}
