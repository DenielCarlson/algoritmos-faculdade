package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario, novoSalario, percentual;
		
		System.out.println("REAJUSTE DE SALARIO");
		
		System.out.print("Digite o valor do salário: ");
		salario = Double.parseDouble(input.nextLine());
		
		System.out.print("Digite o porcentual de reajuste: (valores validos de 0 a 1) ");
		percentual = Double.parseDouble(input.nextLine());
		
		novoSalario = salario * (percentual + 1);
		
		System.out.println("Salario reajustado: " + String.format("R$%.2f", novoSalario));
		
		input.close();
	}
}

