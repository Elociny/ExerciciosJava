package manzanoJavaL01;

import java.util.Scanner;

public class L01G {
	public static void main(String[] args) {
		// Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na
		// utiliza��o do conceito da propriedade distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D,
		// devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
		// C com D. Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de
		// multiplica��o e apresentar doze resultados de sa�da.

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor da primeira vari�vel");
		int a = leia.nextInt();
		System.out.println("Informe o valor da segunda vari�vel");
		int b = leia.nextInt();
		System.out.println("Informe o valor da terceira vari�vel");
		int c = leia.nextInt();
		System.out.println("Informe o valor da quarta vari�vel");
		int d = leia.nextInt();
		leia.close();

		int variavelABMultiplicada = a * b;
		int variavelACMultiplicada = a * c;
		int variavelADMultiplicada = a * d;

		int variavelBCMultiplicada = b * c;
		int variavelBDMultiplicada = b * d;

		int variavelCDMultiplicada = c * d;

		int variavelABSomada = a + b;
		int variavelACSomada = a + c;
		int variavelADSomada = a + c;

		int variavelBCSomada = b + c;
		int variavelBDSomada = b + d;

		int variavelCDSomada = c + d;

		System.out.println("A multiplica��o dos valores por A s�o: " + variavelABMultiplicada);
		System.out.println("A multiplica��o dos valores por A s�o: " + variavelACMultiplicada);
		System.out.println("A multiplica��o dos valores por A s�o: " + variavelADMultiplicada);

		System.out.println("A multiplica��o dos valores por B s�o: " + variavelABMultiplicada);
		System.out.println("A multiplica��o dos valores por B s�o: " + variavelBCMultiplicada);
		System.out.println("A multiplica��o dos valores por B s�o: " + variavelBDMultiplicada);

		System.out.println("A multiplica��o dos valores por C s�o: " + variavelACMultiplicada);
		System.out.println("A multiplica��o dos valores por C s�o: " + variavelBCMultiplicada);
		System.out.println("A multiplica��o dos valores por C s�o: " + variavelCDMultiplicada);

		System.out.println("A multiplica��o dos valores por D s�o: " + variavelADMultiplicada);
		System.out.println("A multiplica��o dos valores por D s�o: " + variavelBDMultiplicada);
		System.out.println("A multiplica��o dos valores por D s�o: " + variavelCDMultiplicada);

		System.out.println("A soma dos valores por A s�o: " + variavelABSomada);
		System.out.println("A soma dos valores por A s�o: " + variavelACSomada);
		System.out.println("A soma dos valores por A s�o: " + variavelADSomada);

		System.out.println("A soma dos valores por B s�o: " + variavelABSomada);
		System.out.println("A soma dos valores por B s�o: " + variavelBCSomada);
		System.out.println("A soma dos valores por B s�o: " + variavelBDSomada);

		System.out.println("A soma dos valores por C s�o: " + variavelACSomada);
		System.out.println("A soma dos valores por C s�o: " + variavelBCSomada);
		System.out.println("A soma dos valores por C s�o: " + variavelCDSomada);

		System.out.println("A soma dos valores por D s�o: " + variavelADSomada);
		System.out.println("A soma dos valores por D s�o: " + variavelBDSomada);
		System.out.println("A soma dos valores por D s�o: " + variavelCDSomada);
	}
}