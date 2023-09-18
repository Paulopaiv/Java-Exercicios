package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		System.out.println("Informe sua altura:");

		try (Scanner altura = new Scanner(System.in)) {
			double a = altura.nextDouble();

			System.out.println("Seu peso ideal é: ");

			double p = (72.7 * a) - 58;
			System.out.println(p);
		}
	}

}
