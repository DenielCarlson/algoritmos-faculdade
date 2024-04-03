package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class SomaImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Integer valor1, valor2, maior, menor;
		Integer sum = 0;
		
		System.out.print("Valor 1: ");
		valor1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Valor 2: ");
		valor2 = Integer.parseInt(input.nextLine());
		
		if(valor1 >= valor2) {
			maior = valor1 ;
			menor = valor2;
		}else{
			maior = valor2;
			menor = valor1;
		}
		
		for(int i = menor + 1; i < maior; i++) {
			
			if(i % 2 != 0) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		input.close();
	}
	
}
