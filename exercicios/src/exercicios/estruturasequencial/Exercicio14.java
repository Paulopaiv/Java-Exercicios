package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		System.out.println("informe quantos Kg foi pescado:");
		try (Scanner peso = new Scanner(System.in)) {
			double p = peso.nextDouble();

			double ex = p - 50;
			System.out.println("Peso exedente: " + ex + "kg");
			double multa = ex * 4;
			System.out.println("valora da multa: R$" + multa);
		}
	}

}
