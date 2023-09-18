package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
			double area = leitor.nextDouble();

			double qtdLitros = area / 3;
			double qtdLatas = qtdLitros / 18;
			double ValorTotal = qtdLatas * 80;
			System.out.println("Qauntidade de latas necessárias: " + qtdLatas);
			System.out.println("Valor total: " + ValorTotal);
		}
	}

}
