package manzanoJavaL01;

import java.util.Scanner;

public class L01J {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
		// dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
		// disponível com o usuário, para que seja apresentado o valor em moeda brasileira.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe quantos dólares você tem: ");
		float dolar = leia.nextFloat();
		
		System.out.println("Informe a cotação do real: ");
		float cotacaoReal = leia.nextFloat();
		
		leia.close();
		float real = dolar * cotacaoReal;
		System.out.println("Você tem " + real + "R$");

	}
}