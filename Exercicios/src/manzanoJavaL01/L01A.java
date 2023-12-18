package manzanoJavaL01;

import java.util.Scanner;

public class L01A {
	public static void main(String[] args) {
		// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
		// conversão é F  = (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em °C: ");
		float celsius = leia.nextFloat();
		leia.close();

		float fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}
}