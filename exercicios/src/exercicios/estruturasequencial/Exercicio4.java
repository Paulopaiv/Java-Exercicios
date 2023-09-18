package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		System.out.println("Informe Primeira nota:");

		try (Scanner nota1 = new Scanner(System.in)) {
			double a = nota1.nextDouble();

			System.out.println("Informe Segunda nota:");

			try (Scanner nota2 = new Scanner(System.in)) {
				double b = nota2.nextDouble();

				System.out.println("Informe Terceira nota:");

				try (Scanner nota3 = new Scanner(System.in)) {
					double c = nota3.nextDouble();

					System.out.println("Informe Quarta nota:");

					try (Scanner nota4 = new Scanner(System.in)) {
						double d = nota4.nextDouble();

						System.out.println("A media e:");
						double media = (a + b + c + d) / 4;
						System.out.println(media);
					}
				}
			}
		}

	}

}
