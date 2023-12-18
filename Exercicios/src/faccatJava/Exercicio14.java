package faccatJava;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
		// contrário escrever NÃO É MAIOR QUE 10! 
		
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Digite um valor para validar se é maior que 10 ou não:");
		float valor = sc.nextFloat();
 
		if (valor > 10) {
			System.out.println("O valor " + valor + " é maior que 10");
		}
 
		if (valor == 10) {
			System.out.println("O valor é igual a " + valor);
		}
 
		if (valor < 10) {
			System.out.println("O valor " + valor + " é menor que 10");
		}
 
	}
}