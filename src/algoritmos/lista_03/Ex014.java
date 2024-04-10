package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = Integer.parseInt(input.nextLine());
		
		if(valor % 2 == 0) {
			System.out.println(valor + " É PAR!");
		}else {
			System.out.println(valor + " É ÍMPAR!");
		}
		
		input.close();
	}
}
