package faccatJava;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		// Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia
		// final deste aluno.
		// Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula
		// para o c�lculo da m�dia
		// final �:
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota!");
		float nota01 = leia.nextFloat();
		System.out.println("Informe a segunda nota!");
		float nota02 = leia.nextFloat();
		System.out.println("Informe a terceira nota!");
		float nota03 = leia.nextFloat();
		leia.close();
		float resultado = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / 10;
		System.out.println("A nota final do aluno �: " + resultado);
	}
}
