package algoritmos.lista_03;

import java.util.Scanner;
import java.util.Locale;

public class Ex006 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double medidaSegundos, horas, minutos, segundos, resto;
		String stringHoras, stringMinutos, stringSegundos;
		
		
		System.out.println("CALCULAR UMA MEDIDA DE TEMPO EM SEGUNDOS E MOSTRAR NO FORMATO HORA:MINUTO.SEGUNDO");
		System.out.println("Exemplo: 3600 segundos que seria igual a 01:00:00");
		System.out.print("Medida em segundos: ");
		medidaSegundos = Double.parseDouble(input.nextLine());
		
		resto = medidaSegundos % 3600;
		
		horas = (medidaSegundos - resto) / 3600;
		
		minutos = (resto - (resto % 60)) / 60;
		
		segundos = resto % 60;
		
		stringHoras = (horas < 10)? String.format("0%.0f", horas):String.format("%.0f", horas);
		stringMinutos = (minutos < 10)? String.format("0%.0f", minutos):String.format("%.0f", minutos);
		stringSegundos = (segundos < 10)? String.format("0%.0f", segundos):String.format("%.0f", segundos);
		
		System.out.printf(stringHoras + ":" + stringMinutos + "." + stringSegundos);
		
		input.close();
	}
}
