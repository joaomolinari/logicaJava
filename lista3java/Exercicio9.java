package lista3java;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio mensal:");
		int salarioMensal=sc.nextInt();
		
		System.out.println("Digite o percetual de reajuste:");
		int percentReajuste=sc.nextInt();
	
		int reajusteTotal= salarioMensal*percentReajuste/100;
		
		int salarioNovo= reajusteTotal+salarioMensal;
		
		System.out.println("O sal�rio novo � de R$:" + salarioNovo);
		
}
	
}