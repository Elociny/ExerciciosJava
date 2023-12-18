package manzanoJavaL01;

import java.util.Scanner;

public class L01I {
	public static void main(String[] args) {
		// Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
		// segundo.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int a = leia.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int b = leia.nextInt();
		
		leia.close();
		System.out.println("O quadrado da diferença do primeiro pelo segundo é: " + (a - b) * (a - b));
	}
}