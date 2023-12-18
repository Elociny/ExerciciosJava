package faccatJava;

import java.util.Scanner;
public class Exercicio38 {
	public static void main(String[]args) {
		// Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
		// diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
		// mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
		// esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
		// senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o usuário");
		int user = leia.nextInt();
		
		if(user == 1234) {
			System.out.println("Informe a senha do usuário!");
			int senha = leia.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Acesso negado");
			}
		}else {
			System.out.println("Acesso negado");
		}
		leia.close();
	}
}
