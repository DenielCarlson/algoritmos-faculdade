package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> divisores = new ArrayList<Integer>();
		int numero;
		int sum = 0;
		
		System.out.print("Digite um valor: ");
		numero = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i < numero; i++) {
			
			if(numero % i == 0) {
				divisores.add(i);
				
			}
		}
		
		for(int divisor : divisores) {
			sum += divisor;
		}
		
		if(sum == numero) {
			System.out.print(numero + " e perfeito");
		}else {
			System.out.print(numero + " nao e perfeito");
		}
		
		input.close();
	}
}

