package faccatJava;

import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[]args) {
		// Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
		// seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		// que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o combust�vel: A para alcool ; G para gasolina");
		String combustivel = leia.next();
		System.out.println("Quantos litros ser�o comprados");
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