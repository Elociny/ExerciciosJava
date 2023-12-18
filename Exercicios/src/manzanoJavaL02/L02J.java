package manzanoJavaL02;

import java.util.Scanner;

public class L02J {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de um valor que esteja entre a
		// faixa de 1 a 9. Ap�s a leitura do valor fornecido pelo usu�rio, o programa
		// dever� indicar uma de
		// duas mensagens: "O valor est� na faixa permitida", caso o usu�rio forne�a o
		// valor nesta faixa,
		// ou a mensagem "O valor est� fora da faixa permitida", caso o usu�rio forne�a
		// valores menores que 1 ou maiores que 9.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = leia.nextInt();
		leia.close();
		if (valor > 0 && valor < 10) {
			System.out.println("O valor est� dentro do valor permitido!");
		} else {
			System.out.println("O valor est� fora do valor permitido!");
		}
	}
}