package manzanoJavaL02;

import java.util.Scanner;

public class L02E {
	public static void main(String[] args) {
		// Efetuar a leitura de tr�s valores (vari�veis A, B e C) e efetuar o c�lculo da
		// equa��o completa de
		// segundo grau, apresentando as duas ra�zes, se para os valores informados for
		// poss�vel efetuar o
		// referido c�lculo. Lembre-se de que a vari�vel A deve ser diferente de zero.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor A: ");
		int valorA = leia.nextInt();
		System.out.println("Informe o valor B: ");
		int valorB = leia.nextInt();
		System.out.println("Informe o valor C: ");
		int valorC = leia.nextInt();
		leia.close();
		double delta = (valorB * valorB) - 4 * (valorA * valorC);
		double valorPositivo = (-valorB) + Math.sqrt(delta) / (2 * valorA);
		double valorNegativo = (-valorB) - Math.sqrt(delta) / (2 * valorA);
		System.out.println(delta);

		if (valorA == 0) {
			System.out.println("Equa��o de primeiro grau");
		} else if (delta >= 0) {
			System.out.println("O valor de X positivo � de: " + valorPositivo);
			System.out.println("O valor de X negativo � de: " + valorNegativo);
		} else {
			System.out.println("A equa��o n�o possui raizes reais");
		}
	}
}