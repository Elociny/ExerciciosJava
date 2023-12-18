package faccatJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o
		// seu antecessor.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int anterior = numero - 1;
		
		System.out.println("O antecessor de " + numero + " é: " + anterior);
	}

}
