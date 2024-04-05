package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int numero, antecessor, sucessor;
		
		System.out.print("Digite um numero: ");
		numero = Integer.parseInt(input.nextLine());
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor de " + numero + " é: " + antecessor);
		System.out.println("O sucessor de " + numero + " é: " + sucessor);
		
		input.close();
	}
}
