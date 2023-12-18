package manzanoJavaL02;

import java.util.Scanner;

public class L02I {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de um número inteiro e apresentar
		// uma mensagem informando se o número é par ou ímpar.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor!");
		int valor = leia.nextInt();
		leia.close();
		if (valor % 2 == 0) {
			System.out.printf("O valor %d é par", valor);
		} else {
			System.out.printf("O valor %d é impar", valor);
		}
	}
}