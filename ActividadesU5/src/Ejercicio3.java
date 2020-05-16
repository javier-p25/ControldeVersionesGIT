import java.util.Scanner;

public class Ejercicio3 {

	

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el numero: ");
		String numero = scan.next();
		// Convertir la cadena a entero utilizando Integer.valueOf  
		Integer n = Integer.valueOf(numero);
		System.out.println(n);

	}

}
