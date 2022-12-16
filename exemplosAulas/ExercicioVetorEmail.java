package exemplosAulas;

public class ExercicioVetorEmail {
	
	public static void main(String[] args) {
		
		String [] email = {"joao@gmail.com","jv@gmail.com","molinari@gmail.com","jvm@gmail.com","jv03@gmail.com"};
		
		for (int i = 0; i < email.length; i++) {
			
			System.out.println(email[i]);
			
		}
		
		System.out.println("A qunatidade de valores armazenados são:" + " " + email.length);
	}

}
