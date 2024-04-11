package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex020 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, notaFinal, media;
		
		System.out.print("Digite a nota 1: ");
		nota1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Digite a note 2: ");
		nota2 = Integer.parseInt(input.nextLine());
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			
			System.out.print("Digite a nota do exame final: ");
			notaFinal = Integer.parseInt(input.nextLine());
			
			System.out.println("Média final: " + notaFinal);
			
			if(notaFinal >= 7) {
				System.out.println("Aprovado");
				
			}else {
				
				System.out.println("Reprovado");
			}
			
		}
		
		input.close();
	}
}
