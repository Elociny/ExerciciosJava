package faccatJava;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[]args) {
		// Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
		// Calcular e escrever o valor do novo sal�rio. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu sal�rio!");
		float salarioMensal = leia.nextFloat();
		System.out.println("Informe o percentual de reajuste!");
		float reajuste = leia.nextFloat();
		leia.close();
		float novoSalario = salarioMensal + ((salarioMensal*reajuste)/100);
		System.out.println("Seu novo sal�rio � de: " + novoSalario);
	}
}