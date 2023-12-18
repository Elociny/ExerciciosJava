package manzanoJavaL02;

import java.util.Scanner;

public class L02L {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
		// saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
		// mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
		// mensagem de saudação o nome previamente informado. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = leia.next();
		System.out.println("Informe o seu sexo: M/F");
		String sexo = leia.next();
		System.out.println(sexo);
		leia.close();
		String mensagem = (sexo.equals("M")) ? ("Olá Illmo Sr." + nome)
				: (sexo.equals("F")) ? ("Olá Imllma Sra." + nome) : "Valor errado";
		System.out.println(mensagem);
	}
}