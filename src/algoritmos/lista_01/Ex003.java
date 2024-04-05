package algoritmos.lista_01;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Locale;

public class Ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		BigDecimal valor;
		
		BigDecimal[] cedulas = {new BigDecimal("100.0"), new BigDecimal("50.0"), new BigDecimal("20.0"), new BigDecimal("10.0"),
				new BigDecimal("5.0"), new BigDecimal("2.0"), new BigDecimal("1.0"), new BigDecimal("0.50"), new BigDecimal("0.25"),
				new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")};
		
		BigDecimal[] quantidades = new BigDecimal[cedulas.length];
		
		String notaOuMoeda;
		
		System.out.print("Digite o valor: ");
		valor = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
		
		System.out.println("NOTAS: ");
		
		for(int i = 0; i < cedulas.length; i++) {
				
			quantidades[i] = valor.subtract(valor.remainder(cedulas[i])).divide(cedulas[i]);
			valor = valor.remainder(cedulas[i]);
			notaOuMoeda = (i >= 6)?" moeda(s) ":" nota(s) ";
			
			//------
			if(i == 6) System.out.println("MOEDAS: ");
			//------
			
			System.out.println(quantidades[i].toBigInteger() + notaOuMoeda + "de R$" + String.format("%.2f", cedulas[i]));
		}
		
		input.close();
	}
}