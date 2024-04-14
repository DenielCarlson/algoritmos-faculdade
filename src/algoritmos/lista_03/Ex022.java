package algoritmos.lista_03;

import java.util.Locale;
import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario, totalVendas;
		
		System.out.println("SALARIO COM BASE NAS VENDAS");
		System.out.print("Salário: ");
		
		salario = Double.parseDouble(input.nextLine());
		
		System.out.print("Total de vendas: ");
		
		totalVendas = Double.parseDouble(input.nextLine());
		
		
		if(totalVendas <= 1500) {
			
			salario += (totalVendas * 0.03);
			
		}else {
			

			salario += (totalVendas * 0.05);
			
		}
		
		System.out.println("Salario total do vendedor: R$" + String.format("%.2f", salario));
	}
}
