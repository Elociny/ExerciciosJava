package manzanoJavaL02;

import java.util.Scanner;

public class L02K {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
		// apresentação, caso o valor não seja maior que três.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = leia.nextInt();
		leia.close();
		if (valor < 4) {
			System.out.println("O valor informado é: " + valor);
		}
	}
}