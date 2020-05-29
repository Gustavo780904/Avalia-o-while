package avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class AvaliacaoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao = 0, totalHoras = 0;
		String nome;
		double horasTrabalhadas = 0.0, valorHora = 0.0;
		double custoIndividual = 0.0, custoTotal = 0.0, ganhoMax = 0.0;
		char digitarOutro;
		String ganhouMais = null;

		do {
			System.out.print("Nome: ");
			nome = sc.next();
			do {
				System.out.print("Horas trabalhadas: ");
				horasTrabalhadas = sc.nextDouble();
			} while (horasTrabalhadas < 0);
			totalHoras = (int) (totalHoras + horasTrabalhadas);
			do {
				System.out.print("Valor por hora: ");
				valorHora = sc.nextDouble();
			} while (valorHora < 0);
			custoIndividual = horasTrabalhadas * valorHora;
			
			if (custoIndividual > ganhoMax) {
				ganhoMax = custoIndividual;
				ganhouMais = nome;
			}
			
			custoTotal = custoTotal + custoIndividual;
			System.out.print("Digitar outro (S/N)? ");
			digitarOutro = sc.next().charAt(0);
		} while (digitarOutro == 'S'|| digitarOutro == 's');

		do {
			System.out.printf("%nMENU%n");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.printf("Digite uma opção: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.printf("%nTotal de horas = " + totalHoras);
				System.out.println(" ");
			} else if (opcao == 2) {
				System.out.printf("%nCusto total = R$ %.2f%n", custoTotal);
			} else if (opcao == 3) {
				System.out.printf("%nPessoa que ganhou mais: " + ganhouMais);
				System.out.println("");
			}
			
		} while (opcao != 4);
		System.out.printf("%nFIM DO PROGRAMA!");
		sc.close();

	}

}
