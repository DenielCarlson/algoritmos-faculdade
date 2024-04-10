package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double custoFabrica;
		double porcentagemDistribuidor, impostos, custoFinal;
		porcentagemDistribuidor = 0.28d;
		impostos = 0.45d;
		custoFinal = 0;
		
		System.out.println("CUSTO FINAL DO DE UM CARRO");
		System.out.print("Custo de fabrica: ");
		custoFabrica = Double.parseDouble(input.nextLine());
		
		custoFinal = custoFabrica + (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos);
		
		System.out.println("O custo final do veículo é de R$" + String.format("%.2f", custoFinal));
		
		input.close();
	}
}

