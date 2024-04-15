package algoritmos.lista_03;

import java.util.Locale;
import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		String time1, time2;
		int gols1, gols2;
		
		System.out.println("TIME VENCEDOR");
		System.out.print("Digite o nome do time 1: ");
		time1 = input.nextLine();
		
		System.out.print("Quantidade de gols: ");
		gols1 = Integer.parseInt(input.nextLine());
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		System.out.print("Digite o nome do time 2: ");
		time2 = input.nextLine();
		
		System.out.print("Quantidade de gols: ");
		gols2 = Integer.parseInt(input.nextLine());
		
		System.out.println("\nRESULTADO\n");
		
		if(gols1 == gols2) {
			
			System.out.println("EMPATE");
			
		}else if(gols1 > gols2) {
			
			System.out.println(time1);
			
		}else {
			
			System.out.println(time2);
			
		}
		
		input.close();
	}
}
