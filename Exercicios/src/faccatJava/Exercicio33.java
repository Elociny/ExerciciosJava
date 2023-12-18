package faccatJava;

import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[]args) {
		//  Ler dois valores e imprimir uma das três mensagens a seguir:
		// ‘Números iguais’, caso os números sejam iguais
		// ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
		// ‘Segundo maior’, caso o segundo seja maior que o primeiro. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor01 = leia.nextInt();
		System.out.println("Informe o segundo valor");
		int valor02 = leia.nextInt();
		leia.close();
		String mensagem = (valor01>valor02)?"O primeiro valor é maior":(valor01==valor02)?"Os valores são iguais":"O segundo valor é maior";
		System.out.println(mensagem);
	}
}
