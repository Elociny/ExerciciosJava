package manzanoJavaL02;

import java.util.Scanner;

public class L02L {
	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
		// sa�da uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
		// mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente tamb�m junto da
		// mensagem de sauda��o o nome previamente informado. 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = leia.next();
		System.out.println("Informe o seu sexo: M/F");
		String sexo = leia.next();
		System.out.println(sexo);
		leia.close();
		String mensagem = (sexo.equals("M")) ? ("Ol� Illmo Sr." + nome)
				: (sexo.equals("F")) ? ("Ol� Imllma Sra." + nome) : "Valor errado";
		System.out.println(mensagem);
	}
}