package manzanoJavaL01;

import java.util.Scanner;

public class L01L {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final �
		// soma dos quadrados dos tr�s valores lidos.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira vari�vel: ");
		int a = leia.nextInt();
		
		System.out.println("Informe a segunda vari�vel: ");
		int b = leia.nextInt();
		
		System.out.println("Informe a terceira vari�vel: ");
		int c = leia.nextInt();

		leia.close();

		System.out.println("A soma do quadrado dos tr�s valores � de: " + ((a * a) + (b * b) + (c * c)));
	}
}