package faccatJava;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[]args) {
		// A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais
		// de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
		// Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva
		// o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas
		// (considere que o m�s possua 4 semanas exatas). 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantas horas foram trabalhadas esta semana!");
		float horarioSemanal = leia.nextFloat();
		System.out.println("Informe quanto voc� recebe por hora");
		float salarioPorHora = leia.nextFloat();
		float salarioSemanal= 0;
		float salarioFinal = 0;
		for(int semana = 1; semana < 5; semana++) {
			if(horarioSemanal < 40) {
				System.out.println("Ainda n�o foram completadas suas horas de trabalho");
			} else {
				if(horarioSemanal > 40) {
					float horaExtra = horarioSemanal - 40;
					float salarioExtra = salarioPorHora/2;
					salarioSemanal = (horarioSemanal*salarioPorHora)+(horaExtra*salarioExtra);
				} else {
					salarioSemanal = (horarioSemanal*salarioPorHora);
				}
				salarioFinal =+ salarioSemanal;
			}			
		}
		System.out.println("Seu sal�rio final foi de: " + salarioFinal + "R$");
	}
}