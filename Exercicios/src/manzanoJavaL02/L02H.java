package manzanoJavaL02;

import java.util.Scanner;

public class L02H {
	public static void main(String[] args) {
		// Efetuar a leitura de cinco números inteiros e identificar o maior e o menor
		// valores.

		Scanner leia = new Scanner(System.in);

		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um valor: ");
			int valor = leia.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			} else if (valor < menorValor) {
				menorValor = valor;
			}
		}
		System.out.printf(" O maior valor é: %d%n O menor valor é: %d", maiorValor, menorValor);
		leia.close();
	}
}