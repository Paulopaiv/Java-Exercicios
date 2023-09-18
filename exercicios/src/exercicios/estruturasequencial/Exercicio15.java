package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		System.out.println("Quanto você quanha por hora?");
		try (Scanner salariohora = new Scanner(System.in)) {
			double sh = salariohora.nextDouble();

			System.out.println("Quantas horas você trabalha por mês?");
			try (Scanner horas = new Scanner(System.in)) {
				double h = horas.nextDouble();

				double sb = (h * sh);
				double ir = sb - (sb - (sb * (11 / 100.0)));
				double inss = sb - (sb - (sb * (8 / 100.0)));
				double sind = sb - (sb - (sb * (5 / 100.0)));
				double liq = sb - ir - inss - sind;
				double desc = ir + inss + sind;

				System.out.println("Salário bruto de: R$" + sb);
				System.out.println("Desconto do IR: R$" + ir);
				System.out.println("Desconto do INSS: R$" + inss);
				System.out.println("Desconto do Sindicato: R$" + sind);
				System.out.println("Salário Liquido de: R$" + liq);
				System.out.println("Total de descontos: R$" + desc);
			}
		}
	}

}
