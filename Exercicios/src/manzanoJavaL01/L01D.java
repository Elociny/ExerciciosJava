package manzanoJavaL01;

import java.util.Scanner;

public class L01D {
	public static void main(String[] args) {
		// Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um
		// autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto
		// (TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a
		// dist�ncia percorrida com a f�rmula DISTANCIA  TEMPO * VELOCIDADE. Possuindo o valor da
		// dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula
		// LITROS_USADOS  DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
		// m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
		// quantidade de litros (LITROS_USADOS) utilizada na viagem.
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o tempo da viagem: ");
		float tempo = leia.nextFloat();

		System.out.println("Informe a velocida m�dia da viagem: ");
		float velocidade = leia.nextFloat();

		leia.close();

		float distancia = (tempo * velocidade);
		float litrosUsados = distancia / 12;

		System.out.println("Horas de viagem: " + tempo);
		System.out.println("Velocidade m�dia da viagem: " + velocidade);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Litros usados: " + litrosUsados);
	}
}