package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = Integer.parseInt(input.nextLine());
		
		if(valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		}else if(valor < 10) {
			System.out.println("NÃO É MAIOR QUE 10!");
		}else{
			System.out.println("É IGUAL A 10!");
		}
		
		input.close();
	}
}