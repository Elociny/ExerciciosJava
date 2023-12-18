package faccatJava;


import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[]args) {
		//Ler um valor e escrever se é positivo, negativo ou zero.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira um valor");
		int valor = leia.nextInt();
		leia.close();
		String mensagem = (valor>0)?"Valor maior que 0":(valor==0)?"Valor igual a 0":"Valor menor que 0";
		System.out.println(mensagem);
	}
}
