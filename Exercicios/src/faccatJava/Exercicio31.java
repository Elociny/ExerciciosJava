package faccatJava;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		// Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam
		// ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma
		// dos outros 2 lados. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		float valor01 = sc.nextInt();
		System.out.println("Informe o segundo valor");
		float valor02 = sc.nextInt();
		System.out.println("Informe o terceiro valor");
		float valor03 = sc.nextInt();
		sc.close();
		
		if (valor01 < valor02 + valor03 && valor02 < valor01 + valor03 && valor03 < valor01 + valor02) {
			System.out.println("Os valores correspondem a um tri�ngulo");
		} else {
			System.out.println("Os valores n�o correspondem a um tri�ngulo");
		}
	}
}
