package lista_faccat;

import java.util.Scanner;

public class Exercicio24 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu sal�rio fixo:");
		short salarioFixo = sc.nextShort();
		
		System.out.println("Informe o valor total de suas vendas:");
		short totalVendas = sc.nextShort();
		
		if (totalVendas<=1500) {
			int salarioNovo = salarioFixo + (totalVendas*3/100);
			System.out.println("Seu sal�rio no final do m�s ser�: " + salarioNovo);
		} else {
			int salarioNovo = salarioFixo + (totalVendas*5/100);
			System.out.println("Seu salario no final do m�s ser� de: " + salarioNovo);
		}

	}

}
