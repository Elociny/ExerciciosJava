package manzanoJavaL01;

import java.util.Scanner;

public class L01F {
	public static void main(String[] args) {
		// Ler dois valores (inteiros, reais ou caracteres) para as vari�veis A e B, e efetuar a troca dos valores de
		// forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da
		// vari�vel A. Apresentar os valores trocados
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira um valor Inteiro na vari�vel A: ");

		int variavelA = leia.nextInt();

		System.out.println("Insira um valor Inteiro na vari�vel B: ");

		int variavelB = leia.nextInt();

		leia.close();

		int guardaValor = variavelA;
		variavelA = variavelB;
		variavelB = guardaValor;

		System.out.println(
				"Vari�vel A agora tem o valor de " + variavelA + " e a vari�vel B agora tem o valor de " + variavelB);
	}
}