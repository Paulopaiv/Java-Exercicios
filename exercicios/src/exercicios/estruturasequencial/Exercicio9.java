package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		System.out.println("Temperatura:");
		try (Scanner fahrenheit = new Scanner(System.in)) {
			double f = fahrenheit.nextDouble();

			double c = 5 * ((f - 32) / 9);
			System.out.println("A temperatura em Celsius e: " + c);
		}
	}
}
