package manzanoJavaL01;

import java.util.Scanner;

public class L01K {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
		// real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
		// com o usuário, para que seja apresentado o valor em moeda americana.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantos Reais você tem: ");
		float real = leia.nextFloat();
		
		System.out.println("Informe a cotação do Dólar: ");
		float cotacaoDolar = leia.nextFloat();
		
		leia.close();
		float dolar = real * cotacaoDolar;
		System.out.println("Você tem " + dolar + " R$");

	}
}