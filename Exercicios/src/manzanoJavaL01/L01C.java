package manzanoJavaL01;

import java.util.Scanner;

public class L01C {
	public static void main(String[] args) {
		// Calcular e apresentar o valor do volume de uma lata de �leo, utilizando a f�rmula:
		// Volume= pi *Raio * Altura
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o raio da lata: ");
		float raio = leia.nextFloat();
		
		System.out.println("Informe a altura da lata: ");
		float altura = leia.nextFloat();
		
		leia.close();
		
		float volume = (float) (3.14 * (raio * raio) * altura);
		System.out.println("O volume da lata � de: " + volume);
	}
}