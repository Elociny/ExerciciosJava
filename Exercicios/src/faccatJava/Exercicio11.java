package faccatJava;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		//  Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
		// mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
		// efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
		// vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
		// vendedor. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu sal�rio");
		float salarioMensal = leia.nextFloat();
		System.out.println("Qual sua porcentagem por carro vendido?");
		int porcentagemCarro = leia.nextInt();
		System.out.println("Quantas vendas voc� fez?");
		int quantidadeVendas = leia.nextInt();
		System.out.println("Quanto voc� recebeu pelas vendas?");
		int valorTotal = leia.nextInt();
		leia.close();
		float salarioFinal = salarioMensal+((porcentagemCarro*valorTotal)/100)+((quantidadeVendas*5)/100);
		System.out.println("O sal�rio final do funcion�rio � de: " + salarioFinal);
		
	}
}
