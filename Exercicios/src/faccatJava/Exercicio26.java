package faccatJava;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[]args){
		// Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e
		// quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade
		// m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual
		// a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
		// compra'. 
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a quantidade m�xima");
		int qtdMaxima = leia.nextInt();
		System.out.println("Insira a quantidade m�nima");
		int qtdMinima = leia.nextInt();
		System.out.println("Insiro o valor total no estoque");
		int qtdEmEstoque = leia.nextInt();
		leia.close();
		
		int qtdMedia = (qtdMaxima+qtdMinima)/2;
		String mensagem = (qtdEmEstoque>=qtdMedia)?"N�o efetuar a compra":"Efetuar a compra";
		System.out.println(mensagem);
		
	}
}