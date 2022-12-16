package lista3java;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int numeroA=sc.nextInt();
		System.out.println("Digite o valor de B:");
		int numeroB=sc.nextInt();
		
		int diferenca = numeroA - numeroB;
		
		int quadradoDiferenca = diferenca*diferenca;
		
		System.out.println("O quadrado da diferença entre A e B é:" + quadradoDiferenca);
		
	}

}
