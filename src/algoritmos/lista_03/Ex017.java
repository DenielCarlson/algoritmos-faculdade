package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int maior, menor;
		
		int[] valores = new int[5];
		
		System.out.print("Digite o valor #1: ");
		valores[0] = Integer.parseInt(input.nextLine());
		
		maior = valores[0];
		menor = valores[0];
		
		
		for(int i = 1; i < valores.length; i++) {
			
			System.out.print("Digite o valor #" + (i + 1) + ": ");
			valores[i] = Integer.parseInt(input.nextLine());
				
			if(maior < valores[i]) {
				
				maior = valores[i];
				
			}else if(menor > valores[i]) {
				
				menor = valores[i];
				
			}
		}
		
		System.out.println("O maior valor é o " + maior);
		System.out.println("O menor valor é o " + menor);
		input.close();
	}
}

