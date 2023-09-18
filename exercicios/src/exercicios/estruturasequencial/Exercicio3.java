package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		System.out.println("Informe um número:");

		try (Scanner leitor1 = new Scanner(System.in)) {
			int a = leitor1.nextInt();

			System.out.println("Informe outro número:");

			try (Scanner leitor2 = new Scanner(System.in)) {
				int b = leitor2.nextInt();

				System.out.println("A soma e:");

				int soma = (a + b);

				System.out.println(soma);
			}
		}

	}

}
