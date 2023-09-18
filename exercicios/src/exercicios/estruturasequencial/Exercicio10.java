package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		System.out.println("Temperatura:");
		try (Scanner celsius = new Scanner(System.in)) {
			double c = celsius.nextDouble();

			double f = (c * 9 / 5) + 32;
			System.out.println("A temperatura em Celsius e: " + f);
		}
	}
}
