package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[3];
		double media;
		
		System.out.println("CALCULAR MEDIA FINAL DE UM ALUNO");
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = Double.parseDouble(input.nextLine());
		}
		
		media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5)) / (2 + 3 + 5);
		
		System.out.println("A media final do aluno é de " + String.format("%.2f", media));
		
		input.close();
	}
}

