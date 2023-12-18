package faccatJava;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		// dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
		// com 365 dias e mês com 30 dias.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		int idadeAnos = sc.nextInt();
		System.out.println("Digite sua idade em meses: ");
		int idadeMeses = sc.nextInt();
		System.out.println("Digite sua idade em dias: ");
		int idadeDias = sc.nextInt();
		
		int idadeTotal = (idadeAnos * 365) + (idadeMeses * 12) + idadeDias;
		
		System.out.println("Você tem " + idadeTotal + " dias de idade.");

	}

}
