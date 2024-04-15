package algoritmos.lista_03;

import java.util.Locale;
import java.util.Scanner;

public class Ex026 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double valor1, valor2;
		
		System.out.println("Digite o valor 1: ");
		valor1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Digite o valor 2: ");
		valor2 = Integer.parseInt(input.nextLine());
		
		
		if(valor1 == valor2) {
			
			System.out.println("Números iguais");
			
		}else if(valor1 > valor2) {
			
			System.out.println("Primeiro é maior");
			
		}else {
			
			System.out.println("Segundo é maior");
			
		}
		
		input.close();
	}
}
