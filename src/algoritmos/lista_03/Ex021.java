package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex021 {

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
		
		
		if(!((a <= b + c) && (b <= a + c) && (c <= a + b))) {
			System.out.println("NÃO FORMA UM TRIÂNGULO");
		}else {
			if(a.equals(b) && b.equals(c)) {
				System.out.println("TRIÂNGULO EQUILÁTERO");
			}else if( (a.equals(b) && b != c) || (a.equals(c) && c != b) || (b.equals(c) && b != a) || (c.equals(b) && b != a) ) {
				System.out.println("TRIÂNGULO ISÓCELES");
			}else {
				System.out.println("TRIÂNGULO ESCALENO");
			}
		}
		
		input.close();
	}
}

