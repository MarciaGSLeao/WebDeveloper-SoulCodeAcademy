package top06e07;

import java.util.Scanner;

public class Arrays {

	// Arrays difere de Listas.
	// Arrays possuem tipo e tamanho fixo;
	// Listas não possuem tamanho fixo. Novos elementos podem ser adicionados conforme a necessidade.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtd = 3;
		String[] names = new String[qtd];
		Integer[] ages = new Integer[qtd];
		
		for(int i = 0; i < qtd; i++ ) {
			names[i] = sc.next();
			ages[i] = sc.nextInt();
		}
		
		for(int i = 0; i < qtd; i++ ) {
			System.out.println(names[i] + " - " + ages[i]);
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		sc.close();
	}
}
