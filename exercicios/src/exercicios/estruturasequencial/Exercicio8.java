package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		try (Scanner valor = new Scanner(System.in)) {
			System.out.println("Quanto você quanha por hora?");

			double v = valor.nextDouble();

			System.out.println("Quantas horas você trabalha por dia:");
			try (Scanner horas = new Scanner(System.in)) {
				double h = horas.nextDouble();

				System.out.println("Seu salário mensal e de:");
				double s = (h * v) * 30;

				System.out.println(s);
			}
		}

	}

}
