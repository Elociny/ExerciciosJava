package faccatJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura),
		// calcular e escrever a �rea do ret�ngulo.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do ret�ngulo: ");
		float base = sc.nextInt();
		System.out.println("Digite altura do ret�ngulo: ");
		float altura = sc.nextInt();

		float area = (base * altura) / 2;
		System.out.println("A �rea total do tri�ngulo citado �: " + area);
	}

}
