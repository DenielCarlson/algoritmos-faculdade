package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex018 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int valor1, valor2, opcao;
		
		System.out.println("CALCULADORA");
		
		System.out.print("Digite o valor 1: ");
		valor1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Digite o valor 2: ");
		valor2 = Integer.parseInt(input.nextLine());
		
		System.out.println("MENU DE OPERAÇÕES");
		System.out.println("[1] SOMA");
		System.out.println("[2] DIFERENÇA");
		System.out.println("[3] PRODUTO");
		System.out.println("[4] DIVISÃO");
		System.out.println("[5] RESTO DA DIVISÃO");
		System.out.println("[6] POTÊNCIA");
		System.out.println("[7] RAIZ QUADRADA");
		System.out.println("Escolha uma das opções: ");
		
		opcao = Integer.parseInt(input.nextLine());
		
		System.out.println();
		System.out.println("RESULTADO");
		
		switch(opcao) {
			
			case 1:
				System.out.println(valor1 + valor2);
				
				break;
			case 2:
				System.out.println(valor1 - valor2);
				
				break;
			case 3:
				System.out.println(valor1 * valor2);
				
				break;
			case 4:
				
				if(valor2 != 0) {
					System.out.println(valor1 / valor2);
				}else {
					System.out.println("ERRO: O denominador é igual a 0");
				}
				
				break;
			case 5:
				if(valor2 != 0) {
						System.out.println(valor1 % valor2);
				}else {
				System.out.println("ERRO: O denominador é igual a 0");
				}
				
				break;
			case 6:
				System.out.println(Math.pow(valor1, valor2));
				
				break;
			case 7:
				System.out.println(Math.sqrt(valor1));
				System.out.println(Math.sqrt(valor2));
				
				break;
			default:
				System.out.println("Operação inválida");
		}
		
		
		
		input.close();
	}
}
