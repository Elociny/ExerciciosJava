package manzanoJavaL02;

import java.util.Scanner;

public class L02G {
	public static void main(String[] args) {
		// Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o
		// divis�veis por 2 e 3.

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe um valor!");
			int valor = leia.nextInt();
			if (valor % 2 == 0 && valor % 3 == 0) {
				System.out.printf("O %d � divis�vel por 2 e 3 %n", valor);
			} else {
				System.out.printf("O %d n�o � divis�vel por 2 e 3 %n", valor);
			}
		}
		
		leia.close();
	}
}