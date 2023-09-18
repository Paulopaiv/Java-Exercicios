package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		System.out.println("Informe o tamanho de um arquivo para download (em MB): ");
		try (Scanner leitor = new Scanner(System.in)) {
			double tamanho = leitor.nextDouble();

			System.out.println("Informe a velocidade download (em MB/s): ");
			double velocidade = leitor.nextDouble();

			double temposeg = tamanho / velocidade;

			double tempomin = temposeg / 60;
			System.out.println("O tempo de Dowload em minutos é de :" + tempomin);
		}
	}

}
