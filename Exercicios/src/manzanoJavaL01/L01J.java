package manzanoJavaL01;

import java.util.Scanner;

public class L01J {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em
		// d�lar. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
		// dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe quantos d�lares voc� tem: ");
		float dolar = leia.nextFloat();
		
		System.out.println("Informe a cota��o do real: ");
		float cotacaoReal = leia.nextFloat();
		
		leia.close();
		float real = dolar * cotacaoReal;
		System.out.println("Voc� tem " + real + "R$");

	}
}