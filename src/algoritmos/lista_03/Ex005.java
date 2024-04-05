package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex005 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println("CALCULA QUANTOS DIAS DE VIDA UMA PESSOA TEM");
		System.out.println("Digite quantos anos, meses e dias de vida voce possui: ");
		System.out.println("Exemplo: Eu possuo 20 anos, 11 meses e 26 dias");
		System.out.print("Anos: ");
		anos = Integer.parseInt(input.nextLine());
		
		System.out.print("Meses: ");
		meses = Integer.parseInt(input.nextLine());
		
		System.out.print("Dias: ");
		dias = Integer.parseInt(input.nextLine());
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Voce tem " + totalDias + " dias de vida");
		
		input.close();
	}
}