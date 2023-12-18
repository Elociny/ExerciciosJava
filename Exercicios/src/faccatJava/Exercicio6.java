package faccatJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
		// calcular e escrever a área do retângulo.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do retângulo: ");
		float base = sc.nextInt();
		System.out.println("Digite altura do retângulo: ");
		float altura = sc.nextInt();

		float area = (base * altura) / 2;
		System.out.println("A área total do triângulo citado é: " + area);
	}

}
