package avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class AvaliacaoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao;
		String nome;
		double horasTrabalhadas = 0.0, valorHora = 0.0;
		char digitarOutro;

		do {
			System.out.print("Nome: ");
			nome = sc.next();
			do {
				System.out.print("Horas trabalhadas: ");
				horasTrabalhadas = sc.nextDouble();
			} while (horasTrabalhadas < 0);
			do {
				System.out.print("Valor por hora: ");
				valorHora = sc.nextDouble();
			} while (valorHora < 0);
			System.out.print("Digitar outro (S/N)? ");
			digitarOutro = sc.next().charAt(0);
		} while (digitarOutro == 'S');

		sc.close();

	}

}
