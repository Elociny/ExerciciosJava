package faccatJava;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[]args) {
		// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
		// de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
		// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
		// o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
		// (considere que o mês possua 4 semanas exatas). 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantas horas foram trabalhadas esta semana!");
		float horarioSemanal = leia.nextFloat();
		System.out.println("Informe quanto você recebe por hora");
		float salarioPorHora = leia.nextFloat();
		float salarioSemanal= 0;
		float salarioFinal = 0;
		for(int semana = 1; semana < 5; semana++) {
			if(horarioSemanal < 40) {
				System.out.println("Ainda não foram completadas suas horas de trabalho");
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
		System.out.println("Seu salário final foi de: " + salarioFinal + "R$");
	}
}