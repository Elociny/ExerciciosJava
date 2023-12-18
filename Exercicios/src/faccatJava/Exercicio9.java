package faccatJava;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[]args) {
		// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
		// Calcular e escrever o valor do novo salário. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu salário!");
		float salarioMensal = leia.nextFloat();
		System.out.println("Informe o percentual de reajuste!");
		float reajuste = leia.nextFloat();
		leia.close();
		float novoSalario = salarioMensal + ((salarioMensal*reajuste)/100);
		System.out.println("Seu novo salário é de: " + novoSalario);
	}
}