package algoritmos.lista_03;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int[] valores = new int[3];
		
		for(int i = 0; i < valores.length; i++){
			
			System.out.print("Valor #" + i + ": ");
			valores[i] = Integer.parseInt(input.nextLine());
			
		}
		
		//fiz de duas formas, pra mostrar uma mais simples usando Arrays.paraLLeLSort e outra usando mais a lógica, Então:
		
		Arrays.parallelSort(valores, 0, 3);
		
		for(int valor : valores) {
			
			System.out.println(valor);
		}
		
		//ou
		
		/*
		int aux;
		
		for(int i = 0; i < valores.length; i++) {
			
			for(int j = 0 + i; j < valores.length; j++) {
				
				if(valores[i]  > valores[j]) {
					
					aux = valores[i];
					
					valores[i] = valores[j];
					
					valores[j] = aux;
				}
				
			}
			
		}
		
		for(int valor : valores) {
			
			System.out.println(valor);
		}
		*/
	}
}
