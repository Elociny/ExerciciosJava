package manzanoJavaL01;

import java.util.Scanner;

public class L01M {
	public static void main(String[] args) {
		// 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira vari�vel: ");
		int a = leia.nextInt();
		
		System.out.println("Informe a segunda vari�vel: ");
		int b = leia.nextInt();
		
		System.out.println("Informe a terceira vari�vel: ");
		int c = leia.nextInt();

		leia.close();

		System.out.println("A soma do quadrado dos tr�s valores � de: " + ((a + b + c) * (a + b + c)));

	}
}