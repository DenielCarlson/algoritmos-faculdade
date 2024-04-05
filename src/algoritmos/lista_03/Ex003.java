package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("CONVERTER GRAUS FAHRENHEIT PARA GRAUS CELSIUS");
		System.out.print("Digite o grau Fahrenheit: ");
		fahrenheit = Double.parseDouble(input.nextLine());
		
		celsius = ((fahrenheit - 32) * 5) / 9;
		
		System.out.print(fahrenheit + " graus Fahrenheit é igual a " + String.format("%.1f", celsius) + " graus celsius");
		input.close();
	}
}
