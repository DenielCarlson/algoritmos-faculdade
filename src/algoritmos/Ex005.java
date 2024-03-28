package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Ex005 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salarioBase, novoSalario;
		
		System.out.print("Salário base: ");
		salarioBase = Double.parseDouble(input.nextLine());
		
		novoSalario = (salarioBase * 1.05)* 0.93;
		
		System.out.println("Salário a receber: " + String.format("$%.2f", novoSalario));
		
		input.close();
	}
}