package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		char caractere;
		
		System.out.print("Digite um caractere de A a Z: ");
		caractere = input.nextLine().charAt(0);
		
		System.out.println("Esse caractere em minúsculo é: " + Character.toLowerCase(caractere));
		
		input.close();
	}
}