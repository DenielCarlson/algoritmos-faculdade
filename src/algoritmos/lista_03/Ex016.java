package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double x, y;

		System.out.println("QUAL QUADRANTE O PAR ORDENADO PERTENCE");
		System.out.print("Digite o valor de x: ");
		x = Double.parseDouble(input.nextLine());

		System.out.print("Digite o valor de y: ");
		y = Double.parseDouble(input.nextLine());
		
		if(x > 0 && y > 0) {
			System.out.printf("(%.2f, %.2f) pertence ao primeiro quadrante", x, y);
			
		}else if(x < 0 && y > 0){
			System.out.printf("(%.2f, %.2f) pertence ao segundo quadrante", x, y);
			
		}else if(x < 0 && y < 0 ) {
			System.out.printf("(%.2f, %.2f) pertence ao terceiro quadrante", x, y);
			
		}else {
			System.out.printf("(%.2f, %.2f) pertence ao quarto quadrante", x, y);
			
		}
		
		input.close();
	}
}
