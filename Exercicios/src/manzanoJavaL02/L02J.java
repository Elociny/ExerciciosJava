package manzanoJavaL02;

import java.util.Scanner;

public class L02J {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de um valor que esteja entre a
		// faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa
		// deverá indicar uma de
		// duas mensagens: "O valor está na faixa permitida", caso o usuário forneça o
		// valor nesta faixa,
		// ou a mensagem "O valor está fora da faixa permitida", caso o usuário forneça
		// valores menores que 1 ou maiores que 9.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = leia.nextInt();
		leia.close();
		if (valor > 0 && valor < 10) {
			System.out.println("O valor está dentro do valor permitido!");
		} else {
			System.out.println("O valor está fora do valor permitido!");
		}
	}
}