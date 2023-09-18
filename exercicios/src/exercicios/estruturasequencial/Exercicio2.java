package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		System.out.println("informe um numero:");
		try (Scanner leitor = new Scanner(System.in)) {
			int a = leitor.nextInt();
			System.out.println("o numero informado e:");
			System.out.println(a);
		}

	}

}
