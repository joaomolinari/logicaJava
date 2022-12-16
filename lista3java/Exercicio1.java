package lista3java;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int numeroA=sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int numeroB=sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int numeroC=sc.nextInt();
		
		System.out.println("Digite o valor de D:");
		int numeroD=sc.nextInt();
		
		int somaAB=numeroA+numeroB;
		int multipAB=numeroA*numeroB;
		
		int somaAC=numeroA+numeroC;
		int multipAC=numeroA*numeroC;
		
		int somaAD=numeroA+numeroD;
		int multipAD=numeroA*numeroD;
		
		int somaBC=numeroB+numeroC;
		int multipBC=numeroB*numeroC;
		
		int somaBD=numeroB+numeroD;
		int multipBD=numeroB*numeroD;
		
		int somaCD=numeroC+numeroD;
		int multipCD=numeroC*numeroD;
		
		System.out.println("A soma entre A+B é:" + somaAB);
		System.out.println("A multiplicação entre A*B é:" + multipAB);
		
		System.out.println("");
		
		System.out.println("A soma entre A+C é:" + somaAC);
		System.out.println("A multiplicação entre A*C é:" + multipAC);
		
		System.out.println("");
		
		System.out.println("A soma entre A+D é:" + somaAD);
		System.out.println("A multiplicação entre A*D é:" + multipAD);
		
		System.out.println("");
		
		System.out.println("A soma entre B+C é:" + somaBC);
		System.out.println("A multiplicação entre B*C é:" + multipBC);
		
		System.out.println("");
		
		System.out.println("A soma entre B+D é:" + somaBD);
		System.out.println("A multiplicação entre B*D é:" + multipBD);
		
		System.out.println("");
		
		System.out.println("A soma entre C+D é:" + somaCD);
		System.out.println("A multiplicação entre C*D é:" + multipCD);
		
		
	}

}
