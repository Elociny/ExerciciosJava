package faccatJava;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
		// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
		// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
		// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
		// calcular e escrever o custo final ao consumidor. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o custo de fábrica do carro!");
		float custoFabrica = leia.nextFloat();
		
		leia.close();
		float valorTotal = custoFabrica+((custoFabrica*28)/100)+((custoFabrica*45)/100);
		System.out.println("O valor do carro para o consumidor é de: " + valorTotal + "R$");
	
	}
}