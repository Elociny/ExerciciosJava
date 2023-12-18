package faccatJava;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		// Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média
		// final deste aluno.
		// Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula
		// para o cálculo da média
		// final é:
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota!");
		float nota01 = leia.nextFloat();
		System.out.println("Informe a segunda nota!");
		float nota02 = leia.nextFloat();
		System.out.println("Informe a terceira nota!");
		float nota03 = leia.nextFloat();
		leia.close();
		float resultado = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / 10;
		System.out.println("A nota final do aluno é: " + resultado);
	}
}
