package faccatJava;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[]args) {
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro time!");
		String timeA = sc.next();
		System.out.println("Informe o nome do segundo time!");
		String timeB = sc.next();
		System.out.println("Informe a quantidade de gols do primeiro time");
		int golsTimeA = sc.nextInt();
		System.out.println("Informe a quantidade de gols do segundo time");
		int golsTimeB = sc.nextInt();
		sc.close();
		
		if(golsTimeA>golsTimeB) {
			System.out.println("O time " + timeA +" venceu: " + golsTimeA +" gols");
		} else if(golsTimeB>golsTimeA) {
			System.out.println("O time " + timeB +" venceu: " + golsTimeB +" gols");
		} else {
			System.out.println("Os dois times empataram: " +golsTimeA+" : "+golsTimeB);
		}
	}
}