package faccatJava;

import java.util.Scanner;
public class Exercicio41 {
	public static void main(String[]args) {
		// Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
		// exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
		// e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo: 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota!");
		double nota01 = leia.nextDouble();
		System.out.println("Informe a segunda nota!");
		double nota02 = leia.nextDouble();
		System.out.println("Informe a terceira nota!");
		double nota03 = leia.nextDouble();
		System.out.println("Informe a média de exercícios!");
		double mediaExercicios = leia.nextDouble();
		leia.close();
		
		String nota = null;
		
		double mediaDeAproveitamento = (nota01+nota02*2+nota03*3+mediaExercicios)/7;
		if(mediaDeAproveitamento>=9 && mediaDeAproveitamento<=10) {
			nota = "A";
		}else if(mediaDeAproveitamento>=7.5 && mediaDeAproveitamento < 9) {
			nota = "B";
		}else if(mediaDeAproveitamento>=6 && mediaDeAproveitamento < 7.5) {
			nota = "C";
		}else if(mediaDeAproveitamento<6) {
			nota = "D";
		}else {
			System.out.println("Valor inválido!");
		}
		
		System.out.println("A nota do aluno foi: " + nota);
	}
}