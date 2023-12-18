package faccatJava;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[]args) {
		// Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o
		// unit�rio. Calcular e escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total
		// a pagar (total a pagar = total - desconto), sabendo-se que:
		// - Se quantidade <= 5 o desconto ser� de 2%
		// - Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
		// - Se quantidade > 10 o desconto ser� de 5%
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o nome do produto");
		String produto = leia.next();
		System.out.println("Informe o pre�o do produto");
		float preco = leia.nextFloat();
		System.out.println("Informe a quantidade que deseja comprar");
		int quantidade = leia.nextInt();
		leia.close();
		
		float valorTotal = quantidade*preco;
		
		if(quantidade <= 5) {
			valorTotal= valorTotal-((valorTotal*2)/100);
		}else if(quantidade > 5 && quantidade <=10) {
			valorTotal= valorTotal-((valorTotal*3)/100);
		}else {
			valorTotal=valorTotal-((valorTotal*5)/100);
		}
		System.out.println("Produto: " + produto + " Quantidade: " + quantidade + " Total: " + valorTotal + "R$");
		
	}

}
