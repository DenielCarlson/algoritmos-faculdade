package algoritmos.lista_02;

import java.util.Scanner;
import java.util.Locale;

public class Ex002 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double media;
		double sum = 0d;
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Nota " + (i + 1) + ": ");
			double nota = Double.parseDouble(input.nextLine());
			
			sum += nota;
		}
		
		media = sum/3;
		
		System.out.println("A média aritmética das notas é igual a " + String.format("%.2f", media));
		
		input.close();
	}
}