package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		char caractere, antecessor, sucessor;
		int ascii;
		
		System.out.print("Digite um caractere: ");
		caractere = input.nextLine().charAt(0);
		
		ascii = (int) caractere;
		
		antecessor = (char) (ascii - 1);
		sucessor = (char) (ascii + 1);
		
		System.out.println("O antecessor desse caractere na tabela ASCII é: " + antecessor);
		System.out.println("O sucessor desse caractere na tabela ASCII é: " + sucessor);
		
		input.close();
	}
}
