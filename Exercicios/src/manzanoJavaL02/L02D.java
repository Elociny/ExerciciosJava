package manzanoJavaL02;

import java.util.Scanner;

public class L02D {
	public static void main(String[] args) {
		// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir
		// uma mensagem
		// dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou
		// igual a 7. Se o valor da
		// m�dia for menor que 7, solicitar a nota de exame, somar com o valor da m�dia
		// e obter nova m�dia.
		// Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que o
		// aluno foi
		// aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem
		// informando esta
		// condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para
		// qualquer condi��o.

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