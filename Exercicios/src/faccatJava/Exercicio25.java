package faccatJava;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[]args) {
		// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
		// escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
		// ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu saldo");
		float saldo = leia.nextFloat();
		System.out.println("Informe seu debito");
		float debito = leia.nextFloat();
		System.out.println("Informe seu credito");
		float credito = leia.nextFloat();
		
		float saldoAtual = (saldo-debito+credito);
		String mensagem = (saldoAtual<0)?"Saldo negativo":"Saldo positivo";
		System.out.println(mensagem + ":" + saldoAtual+"R$");
		leia.close();
	}
}
