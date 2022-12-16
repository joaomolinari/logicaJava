package lista2java;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual:");
		float salario=sc.nextFloat();
		System.out.println("Digite o percentual de reajuste:");
		float percentReajuste=sc.nextFloat();
		
		float reajuste=salario*percentReajuste/100;
		float novoSalario= reajuste+salario;
		
		
		System.out.println("O salário atualizado é de R$"+novoSalario);
		
	}

}
