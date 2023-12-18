package faccatJava;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String []args) {
		// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
		// compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
		// escreva o custo total da compra. 
		
		Scanner sc = new Scanner(System.in);
		double soma;
 
		System.out.println("Digite a quantidade de Maçãs que deseja comprar");
		int quantidadeMacas = sc.nextInt();
 
		if (quantidadeMacas >= 12) {
			soma = quantidadeMacas * 1;
			System.out.println("Como foi pedido " + quantidadeMacas + " Maçãs, o preço fica R$" + soma + ",00");
		} else {	
		   soma =  1.3 * quantidadeMacas;
		  System.out.println("Como foi pedido " + quantidadeMacas + " Maçãs, o preço fica R$" + soma);
		}
	}
}
