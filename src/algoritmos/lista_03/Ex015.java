package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex015 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int quantidadeMaca;
		double custo;

		System.out.println("CUSTO DAS MAÇÃs");
		System.out.print("Quantas maças? ");
		quantidadeMaca = Integer.parseInt(input.nextLine());
		
		if(quantidadeMaca < 12) {
			
			custo = quantidadeMaca * 1.30;
			
		}else {
			
			custo = quantidadeMaca;			
		}
		
		System.out.println("O custo final da(s) " + quantidadeMaca + " maçãs é de R$" + String.format("%.2f", custo));
		
		input.close();
	}
}
