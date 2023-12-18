package manzanoJavaL01;

import java.util.Scanner;

public class L01B {
	public static void main(String[] args) {
		// Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
		// conversão é C  (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = leia.nextFloat();
		leia.close();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("A temperatura em é " + celsius + "°C");
	}
}