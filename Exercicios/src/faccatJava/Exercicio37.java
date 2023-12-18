package faccatJava;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[]args) {
		// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
		// ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
		// morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos Kg de morango quer comprar?");
		double kgMorangos = leia.nextDouble();
		System.out.println("Quantos Kg de maçã quer comprar?");
		double kgMacas = leia.nextDouble();
		leia.close();
		
		double kgTotais = kgMorangos + kgMacas;

		double valorTotalMorangos;
		double valorTotalMacas;
		double valorAcimaDe5kgMacas;
		double valorAcimaDe5kgMorangos;
		
		
		if(kgMorangos < 6) {
			valorTotalMorangos = kgMorangos * 2.50;				
		} else {
			valorAcimaDe5kgMorangos = kgMorangos-5;
			valorTotalMorangos = (5 * 2.50)+(valorAcimaDe5kgMorangos*2.20);
			
		}
		if(kgMacas < 6) {
			valorTotalMacas = kgMacas * 1.80;				
		} else {
			valorAcimaDe5kgMacas = kgMacas-5;
			valorTotalMacas = (5 * 1.80)+(valorAcimaDe5kgMacas*1.50);
		}
		
		double valorFrutas = valorTotalMacas+valorTotalMorangos;
		
		if(valorFrutas > 25 || kgTotais > 8) {
			valorFrutas = valorFrutas-((valorFrutas*10)/100);
		}
		System.out.println("O valor das frutas foi de: " + valorFrutas + "R$");
	}
}
