package faccatJava;

import java.util.Scanner;
public class Exercicio42 {
	public static void main(String[]args) {
		// Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. Para
		// estar em condi��es, um dos seguintes requisitos deve ser satisfeito:
		// - Ter no m�nimo 65 anos de idade.
		// - Ter trabalhado no m�nimo 30 anos.
		// - Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos.
		// Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do empregado (c�digo), o ano
		// de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo
		// de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o n�mero do funcion�rio!");
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
			System.out.println(nFuncionario + " N�o requerer aposentadoria!");
		}
		
	}
}