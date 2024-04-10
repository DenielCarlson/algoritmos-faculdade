package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int totalEleitores, votosBrancos, votosNulos, votosValidos;
		
		System.out.println("ELEITORES DE UM MUNICIPIO");
		System.out.print("Total de eleitores: ");
		totalEleitores = Integer.parseInt(input.nextLine());
		
		System.out.print("Votos brancos: ");
		votosBrancos = Integer.parseInt(input.nextLine());
		
		System.out.print("Votos nulos: ");
		votosNulos = Integer.parseInt(input.nextLine());
		
		System.out.print("Votos validos: ");
		votosValidos = Integer.parseInt(input.nextLine());
		
		votosBrancos = (votosBrancos * 100) / totalEleitores;
		
		votosNulos = (votosNulos * 100) / totalEleitores;
		
		votosValidos = (votosValidos * 100) / totalEleitores;
		
		System.out.println("Total de votos: " + totalEleitores);
		System.out.println("Porcentagem de votos Brancos: " + votosBrancos + "%");
		System.out.println("Porcentagem de votos nulos: " + votosNulos + "%");
		System.out.println("Porcentagem de votos validos: " + votosValidos + "%");
		
		input.close();
	}
}
