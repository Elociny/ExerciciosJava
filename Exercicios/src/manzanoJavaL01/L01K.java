package manzanoJavaL01;

import java.util.Scanner;

public class L01K {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em
		// real. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel
		// com o usu�rio, para que seja apresentado o valor em moeda americana.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantos Reais voc� tem: ");
		float real = leia.nextFloat();
		
		System.out.println("Informe a cota��o do D�lar: ");
		float cotacaoDolar = leia.nextFloat();
		
		leia.close();
		float dolar = real * cotacaoDolar;
		System.out.println("Voc� tem " + dolar + " R$");

	}
}