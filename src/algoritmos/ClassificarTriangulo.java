package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class ClassificarTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Double a, b, c;
		
		System.out.print("Valor A: ");
		a = Double.parseDouble(input.nextLine());
		
		System.out.print("Valor B: ");
		b = Double.parseDouble(input.nextLine());
		
		System.out.print("Valor C: ");
		c = Double.parseDouble(input.nextLine());
		
		
		do {
			double aux;
			
			if(a < b) {
				
				aux = a;
				a = b;
				b = aux;
			}else if(a < c) {
				
				aux = a;
				a = c;
				c = aux;
			}
			
			//-----------
			if(a >= b && a >= c) break;
			//-----------
			
		}while(true);
		
		if(a >= b + c) {
			System.out.println("NAO FORMA UM TRIANGULO");
		}else {
			
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if(a.equals(b) && b.equals(c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}else if( (a.equals(b) && b != c) || (a.equals(c) && c != b) || (b.equals(c) && b != a) || (c.equals(b) && b != a) ) {
				System.out.println("TRIANGULO ISOCELES");
			}else {
				System.out.println("TRIANGULO ESCALENO");
			}
		}
		
		input.close();
	}
}
