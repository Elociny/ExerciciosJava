package faccatJava;

import java.util.Scanner;
public class Exercicio38 {
	public static void main(String[]args) {
		// Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
		// diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
		// mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se
		// esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a
		// senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o usu�rio");
		int user = leia.nextInt();
		
		if(user == 1234) {
			System.out.println("Informe a senha do usu�rio!");
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
