package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double a, b, c, delta;
		Double r1, r2;
		
		System.out.println("Coeficientes da equação");
		System.out.print("Valor de a: ");
		a = Double.parseDouble(input.nextLine());
		
		System.out.print("Valor de b: ");
		b = Double.parseDouble(input.nextLine());
		
		System.out.print("Valor de c: ");
		c = Double.parseDouble(input.nextLine());
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if(delta >= 0) {
			
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("Raiz 1: " + String.format("%.5f", r1));
			System.out.println("Raiz 2: " + String.format("%.5f", r2));
		}else {
			System.out.println("Equação não tem solução no conjuto dos números reais");
		}
		
		input.close();
	}
}
