package lista_faccat;

import java.util.Scanner;

public class Exercicio27 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe um valor: ");
			byte valor = sc.nextByte();
			
			if (valor>0) {
				System.out.println("O valor é positivo");
			} else if (valor==0) {
				System.out.println("O valor é neutro");
			} else {
				System.out.println("O valor é negativo");
			}

		}
		
}
