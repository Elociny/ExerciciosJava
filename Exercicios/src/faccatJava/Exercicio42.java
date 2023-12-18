package faccatJava;

import java.util.Scanner;
public class Exercicio42 {
	public static void main(String[]args) {
		// Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
		// estar em condições, um dos seguintes requisitos deve ser satisfeito:
		// - Ter no mínimo 65 anos de idade.
		// - Ter trabalhado no mínimo 30 anos.
		// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
		// Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
		// de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
		// de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o número do funcionário!");
		String nFuncionario = leia.next();
		System.out.println("Informe o ano de nascimento do funcionario!");
		int anoNascimento = leia.nextInt();
		System.out.println("Informe o ano de ingresso da empresa!");
		int entradaEmpresa = leia.nextInt();
		System.out.println("Informe o ano atual!");
		int anoAtual = leia.nextInt();
		leia.close();
		
		int idadeFuncionario = anoAtual-anoNascimento;
		int tempoDeEmpresa = anoAtual-entradaEmpresa;
		
		if(idadeFuncionario>64) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		} else if(tempoDeEmpresa>29) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		}else if(idadeFuncionario > 59 && tempoDeEmpresa > 24) {
			System.out.println(nFuncionario + " Requerer aposentadoria!");
		}else {
			System.out.println(nFuncionario + " Não requerer aposentadoria!");
		}
		
	}
}