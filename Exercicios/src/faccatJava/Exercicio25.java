package faccatJava;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[]args) {
		// Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e
		// escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior
		// ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'. 
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
