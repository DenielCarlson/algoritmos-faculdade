package algoritmos.lista_01;

import java.util.Scanner;
import java.util.Locale;

public class Ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double notaA, notaB, media;
		
		final Double PESO_A = 3.5;
		final Double PESO_B = 7.5;
		
		System.out.print("Nota A: ");
		notaA = Double.parseDouble(input.nextLine());
		
		System.out.print("Nota B: ");
		notaB = Double.parseDouble(input.nextLine());
		
		media = ((notaA * PESO_A) + (notaB * PESO_B)) / (PESO_A + PESO_B);
		
		System.out.println("MEDIA = " + String.format("%.5f", media));

		input.close();
	}
}
