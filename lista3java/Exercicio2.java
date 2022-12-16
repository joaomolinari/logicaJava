package lista3java;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa retangular:");
		int comprimento=sc.nextInt();
		System.out.println("Digite a largura da caixa retangular:");
		int largura=sc.nextInt();
		System.out.println("Digite a altura da caixa retangular:");
		int altura=sc.nextInt();
		
		int volume = comprimento*largura*altura;
		
		System.out.println("O volume da caixa retangular é:" + volume);
	}

}
