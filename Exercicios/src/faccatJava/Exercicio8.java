package faccatJava;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o
		// n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual
		// que cada um representa em rela��o ao total de eleitores.

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

		System.out.println("A porcentagem de votos nulos �: " + porcentagemNulos + "%" + "\nA porcentagem de votos brancos �: " + porcentagemBrancos + "%" + "\nA porcentagem de votos v�lidos �: " + porcentagemValidos + "%");
	}

}
