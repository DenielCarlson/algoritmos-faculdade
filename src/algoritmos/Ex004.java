package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Ex004 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario;
		double percentualAumento;
		
		System.out.print("Salário: ");
		salario = Double.parseDouble(input.nextLine());
		
		System.out.print("Percentual de aumento: ");
		percentualAumento = Double.parseDouble(input.nextLine());
		
		salario *= (1 + (percentualAumento/100));
		
		System.out.println("O novo salário é: " +  String.format("$%.2f", salario));
		
		input.close();
	}
}