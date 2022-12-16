package lista_manzano;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		short contadora = 1;
		int acumulador = 0;
		
		while (contadora<=500) {	
			if (contadora%2==0) {
				acumulador += contadora;
			}
			
			contadora++;
		}
		
		System.out.println("A soma dos valores pares de 1 ao 500 é: "+acumulador);
	}

}
