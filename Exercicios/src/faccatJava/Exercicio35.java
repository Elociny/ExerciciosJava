package faccatJava;

import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[]args) {
		// Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
		// seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		// que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o combustível: A para alcool ; G para gasolina");
		String combustivel = leia.next();
		System.out.println("Quantos litros serão comprados");
		double litros = leia.nextDouble();
		leia.close();
		
		double valorTotal;
		double valorAcimaDe20;
		
		switch (combustivel) {
		case "A":
			if(litros < 21) {
				valorTotal = ((litros*(2.90-((2.90*3)/100))));
			}else {
				valorAcimaDe20 = litros-20;
				valorTotal = ((20*(2.90-((2.90*3)/100))))+((valorAcimaDe20*(2.90-((2.90*5)/100))));
			}
			System.out.println("O valor total ficou de:" + valorTotal + "R$");
			break;
		case "G":
			if(litros < 21) {
				valorTotal = ((litros*(3.30-((3.30*4)/100))));
			}else {
				valorAcimaDe20 = litros-20;
				valorTotal = ((20*(3.30-((3.30*3)/100))))+((valorAcimaDe20*(3.30-((3.30*6)/100))));
			}
			System.out.println("O valor total ficou de:" + valorTotal + "R$");
			break;
		default:
			break;
		}
	}
}