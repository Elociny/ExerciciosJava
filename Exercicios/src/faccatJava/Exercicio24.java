package faccatJava;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
		// ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
		// ultrapassar este valor, calcular e escrever o seu salário total. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		float salarioFixo = sc.nextFloat();
		System.out.println("Quanto foi o valor de suas vendas? ");
		float valorVendas = sc.nextFloat();
		float salarioFinal = 0;
		float vendasSuperiorA1500 = 0;
		if (valorVendas < 1500) {
			salarioFinal = salarioFixo + ((valorVendas * 3) / 100);
		} else {
			vendasSuperiorA1500 = (valorVendas - 1500);
			salarioFinal = salarioFixo + ((1500 * 3) / 100) + ((vendasSuperiorA1500 * 5) / 100);
		}

		System.out.println("O salário final do vendedor foi de: R$" + salarioFinal);
		sc.close();

	}
}