package aula1prog5;

import java.util.Scanner;

public class Aula1Prog5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n1;
		int n2;

		System.out.print("Primeiro numero: ");
		n1 = entrada.nextInt();

		System.out.print("Segundo numero: ");
		n2 = entrada.nextInt();

		if (n1 == n2)
			System.out.printf("%d == %d%n", n1, n2);

		if (n1 != n2)
			System.out.printf("%d != %d%n", n1, n2);

		if (n1 < n2)
			System.out.printf("%d < %d%n", n1, n2);

		if (n1 > n2)
			System.out.printf("%d > %d%n", n1, n2);

		if (n1 <= n2)
			System.out.printf("%d <= %d%n", n1, n2);

		if (n1 >= n2)
			System.out.printf("%d >= %d%n", n1, n2);
	} // fim main
} // fim da classe
