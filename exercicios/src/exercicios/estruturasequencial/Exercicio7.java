package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		System.out.println("infome o tamanho dos lados do quadrado:");

		try (Scanner lado = new Scanner(System.in)) {
			double a = lado.nextDouble();

			System.out.println("O dobro da área do quadrado e:");

			double b = (a * a) * 2;
			System.out.println(b);
		}

	}

}
