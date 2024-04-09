package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double x, a, b, c, d, e;
		double moduloX;
		
		System.out.println("CALCULAR AS EXPRESSÕES DE a) A e)");
		System.out.print("Digite o valor de x: ");
		x = Double.parseDouble(input.nextLine());
		
		moduloX = (x > 0) ? x : -x;
		
		a = (Math.pow(x, 3)) + (5 * Math.pow(x, 7)) + (2 * Math.pow(x, 9));
		
		b = Math.sin(x) / x;
		
		c = Math.pow((1 + (1 / x)), x);
		 
		d = Math.sqrt(Math.log(moduloX + 1) + Math.log(moduloX + 1) / Math.log(2));
		
		e = Math.asin(x) + Math.acos(x);
		
		
		System.out.println();
		System.out.println("A)---------------------------------------------");
		
		// a
		System.out.println("     3    7    9");
		System.out.println("y = x + 5x + 2x = " + a);
		
		System.out.println();
		System.out.println("B)---------------------------------------------");
		
		//b
		System.out.println("    sen(x)");
		System.out.println("y = ______ = " + b);
		System.out.println("      x   ");
		
		System.out.println();
		System.out.println("C)---------------------------------------------");
		
		//c
		System.out.println("          1  x");
		System.out.println("y = (1 + ___) = " + c);
		System.out.println("          x ");
		
		System.out.println();
		System.out.println("D)---------------------------------------------");
		
		//d 
		System.out.println("  ___________________________");
		System.out.println("_/ln(|x| + 1) + log (|x| + 1) = " + d);
		System.out.println("                   2");
		
		System.out.println();
		System.out.println("E)---------------------------------------------");
		
		//e
		System.out.println("arcsen(x) + arccos(x) = " + e);
		
		input.close();
	}
}
