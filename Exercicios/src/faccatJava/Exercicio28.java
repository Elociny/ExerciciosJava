package faccatJava;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		// Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int valor01 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor02 = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int valor03 = sc.nextInt();
		sc.close();
		if (valor01 < valor02 && valor01 < valor03) {
			System.out.println(valor02 + valor03);
		} else if (valor02 < valor01 && valor02 < valor03) {
			System.out.println(valor01 + valor03);
		} else {
			System.out.println(valor01 + valor02);
		}
	}
}