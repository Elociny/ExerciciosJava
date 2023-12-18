package manzanoJavaL01;

import java.util.Scanner;

public class L01H {
	public static void main(String[] args) {
		// Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
		// VOLUME = COMPRIMENTO * LARGURA * ALTURA.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o comprimento da caixa retangular: ");
		float comprimento = leia.nextFloat();
		
		System.out.println("Informe a largura da caixa: ");
		float largura = leia.nextFloat();
		
		System.out.println("Informe a altura da caixa: ");
		float altura = leia.nextFloat();
		
		leia.close();
		
		float volume = comprimento * altura * largura;
		System.out.println("O volume da caixa retangular é de " + volume);
	}
}