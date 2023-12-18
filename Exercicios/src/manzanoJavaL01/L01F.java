package manzanoJavaL01;

import java.util.Scanner;

public class L01F {
	public static void main(String[] args) {
		// Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
		// forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
		// variável A. Apresentar os valores trocados
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira um valor Inteiro na variável A: ");

		int variavelA = leia.nextInt();

		System.out.println("Insira um valor Inteiro na variável B: ");

		int variavelB = leia.nextInt();

		leia.close();

		int guardaValor = variavelA;
		variavelA = variavelB;
		variavelB = guardaValor;

		System.out.println(
				"Variável A agora tem o valor de " + variavelA + " e a variável B agora tem o valor de " + variavelB);
	}
}