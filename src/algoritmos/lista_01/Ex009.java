package algoritmos.lista_01;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Ex009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		final char[] SIMBOLOS_HEXADECIMAIS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		int numero, resto;
		String hexadecimal_numero = "";
		
		Stack<Integer> restos = new Stack<Integer>();

		Map<Integer, Character> conversor = new HashMap<Integer, Character>();
		
		for(int i = 0; i < SIMBOLOS_HEXADECIMAIS.length; i++) {
			conversor.put(i, SIMBOLOS_HEXADECIMAIS[i]);
		}
		
		System.out.print("Digite um valor em decimal: ");
		numero = Integer.parseInt(input.nextLine());
		
		while(true) {
			
			resto = numero % 16;
			restos.push(resto);
			
			// ---------
			if(numero / 16 == 0) break;
			// ---------
			
			numero = numero / 16;
		}
		
		while(!restos.empty()) {
			
			hexadecimal_numero += conversor.get(restos.pop());
			
		}
		
		System.out.println(hexadecimal_numero);
		
		input.close();
	}
}


