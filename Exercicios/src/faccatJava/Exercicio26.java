package faccatJava;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[]args){
		// Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
		// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
		// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
		// a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
		// compra'. 
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a quantidade máxima");
		int qtdMaxima = leia.nextInt();
		System.out.println("Insira a quantidade mínima");
		int qtdMinima = leia.nextInt();
		System.out.println("Insiro o valor total no estoque");
		int qtdEmEstoque = leia.nextInt();
		leia.close();
		
		int qtdMedia = (qtdMaxima+qtdMinima)/2;
		String mensagem = (qtdEmEstoque>=qtdMedia)?"Não efetuar a compra":"Efetuar a compra";
		System.out.println(mensagem);
		
	}
}