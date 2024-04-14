package algoritmos.lista_03;

import java.util.Locale;
import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um valor numérico: ");
		valor = Integer.parseInt(input.nextLine());
		
		if(valor < 0) {
			
			System.out.println(valor + " é negativo!");
			
		}else if(valor > 0) {
			
			System.out.println(valor + " é positivo!");
			
		}else {
			
			System.out.println(valor + " é igual a zero!");
			
		}
	}
}
