package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Fibonacci {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int ant = 1;
		int desc = 1;
		int result = 0;
		int aux;
		
		System.out.print("Digite um valor n: (0 < n > 46)");
		n = Integer.parseInt(input.nextLine());
		
		System.out.print(0 + " " + 1 + " " + 1);
		
		for(int i =0; i < n - 3; i++) {
			
			result = ant + desc;
			System.out.print(" " + result);
			
			aux = desc;
			desc = result;
			ant = aux;
			
		}
		
		input.close();
	}
}
