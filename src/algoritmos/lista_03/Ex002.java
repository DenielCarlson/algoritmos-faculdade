package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.println("CALCULAR AREA DO RETANGULO");
		System.out.print("Qual é o valor da base: ");
		base = Integer.parseInt(input.nextLine());
		
		System.out.print("Qual é o valor da altura: ");
		altura = Integer.parseInt(input.nextLine());
		
		area = base * altura;
		
		System.out.println("A area do retangulo de base " + base + " e altura " + altura + " é igual a " + area);
		
		input.close();
	}
}