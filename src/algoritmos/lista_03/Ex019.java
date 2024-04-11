package algoritmos.lista_03;

import java.util.Scanner;

import java.util.Locale;

public class Ex019 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int horasProfessor1, horasProfessor2;
		
		double valorPorHoraProfessor1, valorPorHoraProfessor2, salario1, salario2;
		
		//Professor 1
		System.out.println("PROFESSOR 1");
		System.out.print("Horas trabalhadas: ");
		horasProfessor1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Valor por hora: ");
		valorPorHoraProfessor1 = Integer.parseInt(input.nextLine());
		
		//Professor 2
		System.out.println("PROFESSOR 2");
		System.out.print("Horas trabalhadas: ");
		horasProfessor2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Valor por hora: ");
		valorPorHoraProfessor2 = Integer.parseInt(input.nextLine());
		
		salario1 = horasProfessor1 * valorPorHoraProfessor1;
		
		salario2 = horasProfessor2 * valorPorHoraProfessor2;
		
		System.out.print("O professor 1 recebe R$" + String.format("%.2f", salario1) + " e o professor 2 recebe R$" +  String.format("%.2f. ", salario2));
		
		System.out.println("Logo o salario do professor " + ((salario1 > salario2)? "1 é maior" : "2 é maior"));
		
		input.close();
	}
}
