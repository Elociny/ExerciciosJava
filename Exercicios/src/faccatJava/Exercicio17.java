package faccatJava;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		//  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
		// uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
		// aluno é aprovado). Escrever também a média calculada. 
		
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Digite o nome do aluno:");
		String aluno = sc.next();
 
		System.out.println("Digite a nota da primeira avaliação do aluno(a) " + aluno);
		float nota1 = sc.nextFloat();
		System.out.println("Digite a nota da segunda avaliação do aluno(a) " + aluno);
		float nota2 = sc.nextFloat();
 
		float soma = nota1 + nota2;
 
		float mediaAritmetica = soma / 2;
 
		if (mediaAritmetica >= 6) {
			System.out.println("Média do aluno: " + mediaAritmetica);
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Média do aluno: " + mediaAritmetica);
			System.out.println("Aluno Reprovado");
		}
	}
}
