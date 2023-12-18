package faccatJava;

import java.util.Scanner;

public class Exercicio21 {
	public static void main (String []args) {
		//  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
		// minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
		// de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horario de inicio do jogo de Xadres");
		   int horarioInicio = sc.nextInt();
		   System.out.println("Digite o horario do fim do jogo de Xadres");
		   int horarioFim = sc.nextInt();
 
		   if (horarioInicio < horarioFim) {
		      int soma = horarioFim - horarioInicio;
		      System.out.println("O total de horas jogadas foram "+ soma+" horas");
		   } else {
		      horarioInicio = 24 - horarioInicio;
		      int soma = horarioInicio + horarioFim;
		      System.out.println("O total de horas jogadas foram "+ soma+" horas");
		   }
 
	}
}