package manzanoJavaL02;

import java.util.Scanner;

public class L02B {
	public static void main(String[] args) {
		// Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
		// n�mero lido como sendo um
		// valor positivo, ou seja, o programa dever� apresentar o m�dulo de um n�mero
		// fornecido. Lembre-se de verificar se o n�mero fornecido � menor que zero;
		// sendo, multiplique-o por -1.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = leia.nextInt();
		leia.close();
		if (valor < 0) {
			System.out.println(valor * -1);
		} else {
			System.out.println(valor);
		}
	}
}