package faccatJava;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		//  Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
		// mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
		// efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
		// vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
		// vendedor. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu salário");
		float salarioMensal = leia.nextFloat();
		System.out.println("Qual sua porcentagem por carro vendido?");
		int porcentagemCarro = leia.nextInt();
		System.out.println("Quantas vendas você fez?");
		int quantidadeVendas = leia.nextInt();
		System.out.println("Quanto você recebeu pelas vendas?");
		int valorTotal = leia.nextInt();
		leia.close();
		float salarioFinal = salarioMensal+((porcentagemCarro*valorTotal)/100)+((quantidadeVendas*5)/100);
		System.out.println("O salário final do funcionário é de: " + salarioFinal);
		
	}
}
