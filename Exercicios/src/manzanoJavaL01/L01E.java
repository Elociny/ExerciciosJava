package manzanoJavaL01;

import java.util.Scanner;

public class L01E {
	public static void main(String[] args) {
		// Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula
		// PRESTACAO = VALOR + ((VALOR * TAXA/100) * TEMPO).
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor da compra: ");
		float valor = leia.nextFloat();
		
		System.out.println("Informe a taxa da compra: ");
		float taxa = leia.nextFloat();
		
		System.out.println("Informe o tempo de atraso da presta��o: ");
		float tempo = leia.nextFloat();
		
		leia.close();
		
		float prestacao = valor + ((valor * taxa / 100) * tempo);
		System.out.println("A presta��o ser� de: " + prestacao);
	}
}