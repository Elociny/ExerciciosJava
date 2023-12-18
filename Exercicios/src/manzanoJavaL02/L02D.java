package manzanoJavaL02;

import java.util.Scanner;

public class L02D {
	public static void main(String[] args) {
		// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir
		// uma mensagem
		// dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou
		// igual a 7. Se o valor da
		// média for menor que 7, solicitar a nota de exame, somar com o valor da média
		// e obter nova média.
		// Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o
		// aluno foi
		// aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem
		// informando esta
		// condição. Apresentar com as mensagens o valor da média do aluno, para
		// qualquer condição.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		double nota01 = leia.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota02 = leia.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota03 = leia.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double nota04 = leia.nextDouble();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado com nota de: " + media);
		} else {
			System.out.println("Informe a nota da prova");
			double prova = leia.nextDouble();
			double novaMedia = (nota01 + nota02 + nota03 + nota04 + prova) / 5;
			if (novaMedia >= 5) {
				System.out.println("Aluno aprovado com nota de: " + novaMedia);
			} else {
				System.out.println("Aluno reprovado com nota de: " + novaMedia);
			}
		}
		
		leia.close();
	}
}