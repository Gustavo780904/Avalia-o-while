package avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class AvaliacaoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao = 0;
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

		do {
			System.out.printf("%nMENU%n");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.printf("Digite uma opção: ");
			opcao = sc.nextInt();
			
		} while (opcao != 4);

		sc.close();

	}

}
