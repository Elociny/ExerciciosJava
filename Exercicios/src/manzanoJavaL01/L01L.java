package manzanoJavaL01;

import java.util.Scanner;

public class L01L {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
		// soma dos quadrados dos três valores lidos.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira variável: ");
		int a = leia.nextInt();
		
		System.out.println("Informe a segunda variável: ");
		int b = leia.nextInt();
		
		System.out.println("Informe a terceira variável: ");
		int c = leia.nextInt();

		leia.close();

		System.out.println("A soma do quadrado dos três valores é de: " + ((a * a) + (b * b) + (c * c)));
	}
}