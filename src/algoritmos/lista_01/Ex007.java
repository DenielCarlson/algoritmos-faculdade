package algoritmos.lista_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> divisores = new ArrayList<Integer>();
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= valor; i++) {
			
			if(valor % i == 0) {
				divisores.add(i);
				
			}
		}
		
		if(divisores.size() == 2) {
			
			System.out.print(valor + " e primo");
		}else {
			System.out.print(valor + " nao e primo");
		}
		
		input.close();
	}
}
