package algoritmos.lista_02;

import java.util.Scanner;
import java.util.Locale;

public class Ex003 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.print("Salário: ");
		salario = Double.parseDouble(input.nextLine());
		
		salario *= 1.25;
		
		System.out.println("O novo salário é: " + String.format("$%.2f", salario));
		
		input.close();
	}
}
