package lista_faccat;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário do funcionário por hora: ");
		float salario = sc.nextFloat();

		System.out.println("Digite o total de horas trabalhadas no mês: ");
		float horas = sc.nextFloat();

		float horasExtras = horas - 160;
		System.out.println("Hora extra: " + horasExtras+ "horas.");

		if (horasExtras > 0) {
			float salarioExtra = horasExtras* (salario + salario * 50 / 100);
			System.out.println("Salário de horas extras: R$" + salarioExtra);

			float salarioFinal = (salario * (horas - horasExtras)) + salarioExtra;
			System.out.println("O salário final é de: R$" + salarioFinal);

		} else {
			float salarioFinal = horas * salario;
			System.out.println("O salário final de é de: R$" + salarioFinal);

		}

	}

}

