package lista_faccat;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o sal�rio do funcion�rio por hora: ");
		float salario = sc.nextFloat();

		System.out.println("Digite o total de horas trabalhadas no m�s: ");
		float horas = sc.nextFloat();

		float horasExtras = horas - 160;
		System.out.println("Hora extra: " + horasExtras+ "horas.");

		if (horasExtras > 0) {
			float salarioExtra = horasExtras* (salario + salario * 50 / 100);
			System.out.println("Sal�rio de horas extras: R$" + salarioExtra);

			float salarioFinal = (salario * (horas - horasExtras)) + salarioExtra;
			System.out.println("O sal�rio final � de: R$" + salarioFinal);

		} else {
			float salarioFinal = horas * salario;
			System.out.println("O sal�rio final de � de: R$" + salarioFinal);

		}

	}

}

