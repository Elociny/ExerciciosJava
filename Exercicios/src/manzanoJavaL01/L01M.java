package manzanoJavaL01;

import java.util.Scanner;

public class L01M {
	public static void main(String[] args) {
		// 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira variável: ");
		int a = leia.nextInt();
		
		System.out.println("Informe a segunda variável: ");
		int b = leia.nextInt();
		
		System.out.println("Informe a terceira variável: ");
		int c = leia.nextInt();

		leia.close();

		System.out.println("A soma do quadrado dos três valores é de: " + ((a + b + c) * (a + b + c)));

	}
}