package manzanoJavaL02;

import java.util.Scanner;

public class L02C {
	public static void main(String[] args) {
		// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir
		// uma mensagem
		// dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou
		// igual a 5. Se o aluno não
		// foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto
		// das mensagens o
		// valor da média do aluno para qualquer condição.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		double nota01 = leia.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota02 = leia.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota03 = leia.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double nota04 = leia.nextDouble();
		leia.close();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		if (media >= 5) {
			System.out.println("Aluno aprovado com nota de: " + media);
		} else {
			System.out.println("Aluno reprovado com nota de: " + media);
		}
	}
}