package manzanoJavaL02;

import java.util.Scanner;

public class L02A {
	public static void main(String[] args) {
		// Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do
		// maior pelo menor valor.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valorA = leia.nextInt();
		System.out.println("Informe outro valor: ");
		int valorB = leia.nextInt();
		leia.close();
		int maiorValor;
		int menorValor;

		if (valorA > valorB) {
			maiorValor = valorA;
			menorValor = valorB;
		} else {
			maiorValor = valorB;
			menorValor = valorB;
		}
		int resultado = maiorValor - menorValor;
		System.out.printf("A diferen�a do %d pelo %d �: %d", maiorValor, menorValor, resultado);

	}
}