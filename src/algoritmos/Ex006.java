package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Ex006 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[] valores = new double[4];
		
		double total = 0d;
		double valorFinal = 0;
		
		for(int i = 0; i < valores.length; i++) {
			
			System.out.print("Preço do produto " + (i + 1) + ": ");
			valores[i] = Double.parseDouble(input.nextLine());
			
			total += valores[i];
		}
		
		while(true) {
			
			if(total <= 100) {
				
				valorFinal = total;
				break;
			}else if(total > 100 && total < 200) {
				
				valorFinal = (valores[0] * 0.9);
				
				for(int i = 1; i < valores.length; i++) {
					
					valorFinal += valores[i];
				}
				
				break;
			}else if(total > 200 && total < 500) {
				
				valorFinal = (valores[0] + valores[1]) * 0.85;
				
				for(int i = 2; i < valores.length; i++) {
					
					valorFinal += valores[i];
				}
				
				break;
			}else {
				
				valorFinal = total * 0.75;
				break;
			}	
		}
		
		System.out.println("Valor total da compra será de " + String.format("$%.2f", valorFinal));
		
		input.close();
	}
}