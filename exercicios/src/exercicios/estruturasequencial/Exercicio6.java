package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		System.out.println("Informe o raio do circulo:");
		try (Scanner raio = new Scanner(System.in)) {
			double r1 = raio.nextDouble();

			System.out.println("A área do ciculo e:");

			double a = Math.PI * (r1 * r1);

			System.out.println(a);
		}
	}

}
