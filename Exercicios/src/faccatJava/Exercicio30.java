package faccatJava;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
		// crescente. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor!");
		int valor01 = sc.nextInt();
		System.out.println("Informe o segundo valor!");
		int valor02 = sc.nextInt();
		System.out.println("Informe o terceiro valor!");
		int valor03 = sc.nextInt();
		int guardaValor = 0;
		sc.close();
		if (valor01 > valor02) {
			guardaValor = valor01;
			valor01 = valor02;
			valor02 = guardaValor;
		}
		if (valor03 < valor02) {
			guardaValor = valor03;
			valor03 = valor02;
			valor02 = guardaValor;
		}
		if (valor02 < valor01) {
			guardaValor = valor01;
			valor01 = valor02;
			valor02 = guardaValor;
		}
		System.out.println(valor01 + "," + valor02 + "," + valor03);

	}
}