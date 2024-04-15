package algoritmos.lista_03;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex027 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int quantidade;
		double preco, valorTotal, valorDesconto, desconto;
		desconto = 0;
		valorDesconto = 0;
		
		
		System.out.println("PRODUTO");
		System.out.print("Nome: ");
		nome = input.nextLine();

		System.out.print("Quantidade: ");
		quantidade = Integer.parseInt(input.nextLine());
		
		System.out.print("Preço: R$");
		preco = Double.parseDouble(input.nextLine());
		
		valorTotal = preco * quantidade;
		
		if(quantidade <= 5) {
			
			valorDesconto = valorTotal * 0.98;
			desconto = valorTotal * 0.02;
			
		}else if(quantidade <= 10){
			
			valorDesconto = valorTotal * 0.97;
			desconto = valorTotal * 0.03;
			
		}else{
			
			valorDesconto = valorTotal * 0.95;
			desconto = valorTotal * 0.05;
			
		}
		
		System.out.println("Valor total: R$" + String.format("%.2f", valorTotal));
		System.out.println("Valor do desconto: R$" + String.format("%.2f", desconto));
		System.out.println("Valor final: R$" + String.format("%.2f", valorDesconto));
		
		input.close();
	}
}

