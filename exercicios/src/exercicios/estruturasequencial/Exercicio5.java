package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		System.out.println("Informe quantos metros:");

		try (Scanner metros = new Scanner(System.in)) {
			double m1 = metros.nextDouble();

			System.out.println("para centrimetros e:");

			double cm = m1 * 100;

			System.out.println(cm);
		}

	}

}
