package faccatJava;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o número total de eleitores de um município, o
		// número de votos brancos, nulos e válidos. Calcular e escrever o percentual
		// que cada um representa em relação ao total de eleitores.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o total de votos: ");
		int totalVotos = sc.nextInt();

		System.out.println("Digite os votos nulos: ");
		int votosNulos = sc.nextInt();

		System.out.println("Digite os votos brancos: ");
		int votosBrancos = sc.nextInt();

		System.out.println("Digite os votos validos: ");
		int votosValidos = sc.nextInt();

		double porcentagemNulos = ((double)votosNulos / totalVotos) * 100;
		double porcentagemBrancos = ((double)votosBrancos / totalVotos) * 100;
		double porcentagemValidos = ((double)votosValidos / totalVotos) * 100;

		System.out.println("A porcentagem de votos nulos é: " + porcentagemNulos + "%" + "\nA porcentagem de votos brancos é: " + porcentagemBrancos + "%" + "\nA porcentagem de votos válidos é: " + porcentagemValidos + "%");
	}

}
