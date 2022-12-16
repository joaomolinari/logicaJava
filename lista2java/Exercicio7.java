package lista2java;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata de óleo:");
		float raio=sc.nextFloat();
		System.out.println("Digite a altura da lata de óleo:");
		float altura=sc.nextFloat();
		
		float volume= (float) (Math.PI*raio*raio*altura);
		
		System.out.println("O volume da lata de óleo é:" +volume);
	}

}
