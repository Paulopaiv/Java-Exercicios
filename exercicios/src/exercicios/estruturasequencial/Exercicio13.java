package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		try (Scanner tamanho = new Scanner(System.in)) {
			System.out.println("Informe sua altura:");
			double t = tamanho.nextDouble();

			System.out.println("Se homen seu peso ideal e:");
			double h = (72.7 * t) - 58;
			System.out.println(h);

			System.out.println("Se mulher seu peso ideal e:");
			double m = (62.1 * t) - 47.7;
			System.out.println(m);
		}
	}

}
