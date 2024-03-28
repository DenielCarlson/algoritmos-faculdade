package algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Ex001 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.print("Número " + (i + 1)+ ": ");
			int num = Integer.parseInt(input.nextLine());
			
			sum += num;
		}
		
		System.out.println("A soma dos quatros números é igual a " + sum);
		
		input.close();
	}
}
