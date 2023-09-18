package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		System.out.println("Informe um número inteiro:");
		try (Scanner numero1 = new Scanner(System.in)) {
			int n1 = numero1.nextInt();

			System.out.println("Informe mais número inteiro:");
			try (Scanner numero2 = new Scanner(System.in)) {
				int n2 = numero2.nextInt();

				System.out.println("Informe um número real:");
				try (Scanner numero3 = new Scanner(System.in)) {
					double n3 = numero3.nextDouble();

					System.out.println("(A)" + "O produto do dobro do primeiro com metade do segundo:");

					double a = (n1 * 2) + n2 / 2;
					System.out.println(a);

					System.out.println("(B)" + "A soma do triplo do primeiro com o terceiro:");

					double b = (3 * n1) + n3;
					System.out.println(b);

					System.out.println("(C)" + "O terceiro elevado ao cubo:");

					double c = Math.pow(n3, 3);

					System.out.println(c);
				}
			}
		}

	}

}
